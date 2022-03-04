#!/usr/bin/env bash

# delete all files that is generated automatically
#rm -rf ../../src/main/resources/com/example/news/web/persistence/UserMapper.xml
rm -rf ../../src/main/resources/com/example/news/web/persistence/NewsMapper.xml
#rm -rf ../../src/main/resources/com/example/news/web/persistence/CollectionKeywordMapper.xml

java -jar mybatis-generator-core-1.3.7.jar -configfile newsConf.xml -overwrite
