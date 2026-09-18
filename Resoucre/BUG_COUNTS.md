# Defects4J bug counts

Scope: all active bug IDs returned by defects4j pids / bids.
Sources: buggy checkout, selected using classes.modified and dir.src.classes.

Bug folders: **855**; verified: **854 / 854**.

| Project | Expected bugs | Verified bugs | Source files |
| --- | ---: | ---: | ---: |
| Chart | 26 | 26 | 28 |
| Cli | 39 | 39 | 51 |
| Closure | 174 | 174 | 225 |
| Codec | 18 | 18 | 27 |
| Collections | 28 | 28 | 28 |
| Compress | 47 | 47 | 58 |
| Csv | 16 | 16 | 17 |
| Gson | 18 | 18 | 21 |
| JacksonCore | 26 | 26 | 35 |
| JacksonDatabind | 110 | 110 | 157 |
| JacksonXml | 6 | 6 | 6 |
| Jsoup | 93 | 93 | 125 |
| JxPath | 22 | 22 | 35 |
| Lang | 61 | 61 | 61 |
| Math | 106 | 106 | 119 |
| Mockito | 38 | 38 | 46 |
| Time | 26 | 26 | 31 |

Missing bug ID numbers are inactive/deprecated IDs excluded by defects4j bids.
Files introduced only in the fix are recorded as absent_in_buggy in _collection manifests.
Existing extra files are preserved; counts above use the collected manifests.
Reproduce/resume: python3 Resoucre/collect_all.py
