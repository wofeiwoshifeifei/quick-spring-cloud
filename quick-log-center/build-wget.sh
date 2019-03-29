#!/bin/bash

tool_version=6.7.0

wget -c O https://artifacts.elastic.co/downloads/elasticsearch/elasticsearch-$tool_version.tar.gz

tar -xvf elasticsearch-$tool_version.tar.gz

wget -c O https://artifacts.elastic.co/downloads/kibana/kibana-$tool_version-linux-x86_64.tar.gz

tar -xvf kibana-$tool_version-linux-x86_64.tar.gz

wget -c O https://artifacts.elastic.co/downloads/beats/filebeat/filebeat-$tool_version-linux-x86_64.tar.gz

tar -xvf filebeat-$tool_version-linux-x86_64.tar.gz

wget -c O https://artifacts.elastic.co/downloads/logstash/logstash-$tool_version.tar.gz

tar -xvf logstash-$tool_version.tar.gz