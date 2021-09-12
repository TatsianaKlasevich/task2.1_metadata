# task2.1_metadata

Написать программу которая при запуске вызывает OutOfMemoryError: Metaspace. В Readme описать условия запуска. (если такие будут, например jvm options)

###### jvm options:
* -XX:MaxMetaspaceSize=10m
* -XX:MetaspaceSize=2M
* -XX:MaxMetaspaceFreeRatio=1
* -XX:MaxMetaspaceExpansion=1K
* -XX:MinMetaspaceFreeRatio=1
* -XX:InitialBootClassLoaderMetaspaceSize=2M
