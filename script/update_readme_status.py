#!/usr/bin/env python3
# -*- coding: utf-8 -*-
import os, re

base_dir = '/home/manamo/wan/SQA-Project/Gemini-3.8-flash'
testcode_dir = os.path.join(base_dir, 'TestCode')
readme_path = os.path.join(base_dir, 'readm.md')

def parse_ranges(s):
    res = set()
    for part in s.split(','):
        part = part.strip()
        if '-' in part:
            lo, hi = map(int, part.split('-'))
            res.update(range(lo, hi + 1))
        elif part:
            res.add(int(part))
    return res

def update_readme():
    with open(readme_path, 'r', encoding='utf-8') as f:
        lines = f.readlines()

    proj_expected = {}
    for line in lines:
        parts = [p.strip() for p in line.split('|')]
        if len(parts) >= 6 and parts[1] not in ['Identifier', '---------------', '']:
            ident = parts[1]
            active_ids = parse_ranges(parts[4])
            proj_expected[ident] = active_ids

    dirs = os.listdir(testcode_dir)
    proj_actual = {k: set() for k in proj_expected}

    for d in dirs:
        d_path = os.path.join(testcode_dir, d)
        if os.path.isdir(d_path):
            m = re.match(r'^([A-Za-z]+)_(\d+)_buggy$', d)
            if m:
                p = m.group(1)
                b = int(m.group(2))
                if p in proj_actual:
                    has_java = any(f.endswith('.java') for _, _, files in os.walk(d_path) for f in files)
                    if has_java:
                        proj_actual[p].add(b)

    new_lines = []
    total_exp = 0
    total_act = 0
    completed_count = 0

    for line in lines:
        parts = [p.strip() for p in line.split('|')]
        if len(parts) >= 7 and parts[1] in proj_expected:
            ident = parts[1]
            exp = len(proj_expected[ident])
            act = len(proj_actual[ident] & proj_expected[ident])
            total_exp += exp
            total_act += act
            if act == exp:
                completed_count += 1
            status_str = f'{act}/{exp} ({int(act/exp*100)}%)'
            parts[6] = f' {status_str:<12} '
            new_line = '|' + '|'.join(parts[1:-1]) + '|\n'
            new_lines.append(new_line)
        elif len(parts) >= 7 and parts[1] == 'Identifier':
            parts[6] = ' TestCode     '
            new_lines.append('|' + '|'.join(parts[1:-1]) + '|\n')
        elif len(parts) >= 7 and parts[1].startswith('---'):
            parts[6] = ' ------------ '
            new_lines.append('|' + '|'.join(parts[1:-1]) + '|\n')
        else:
            new_lines.append(line)

    with open(readme_path, 'w', encoding='utf-8') as f:
        f.writelines(new_lines)

    print(f"Readme updated: Total {total_act}/{total_exp} ({completed_count}/17 projects complete)")

if __name__ == '__main__':
    update_readme()
