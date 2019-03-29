#!/bin/bash

tool_version=6.7.0
busslogPath=/usr/local/apache-tomcat-8.5.38/logs_fh
quartZLogPath=/usr/local/apache-tomcat-quartz/logs_fh

curl -O https://artifacts.elastic.co/downloads/elasticsearch/elasticsearch-$tool_version.tar.gz

tar -xvf elasticsearch-$tool_version.tar.gz

curl -O https://artifacts.elastic.co/downloads/kibana/kibana-$tool_version-linux-x86_64.tar.gz

tar -xvf kibana-$tool_version-linux-x86_64.tar.gz

curl -O https://artifacts.elastic.co/downloads/beats/filebeat/filebeat-$tool_version-linux-x86_64.tar.gz

tar -xvf filebeat-$tool_version-linux-x86_64.tar.gz

curl -O https://artifacts.elastic.co/downloads/logstash/logstash-$tool_version.tar.gz

tar -xvf logstash-$tool_version.tar.gz

chmod 777 sh -x elasticsearch-$tool_version/bin/elasticsearch

adduser elasticUser

echo elasticUser | passwd --stdin elasticUser

chown -R elasticUser:elasticUser elasticsearch-6.7.0

su elasticUser

#rum elasticSearch ,notes:cannot run as root
sh -x elasticsearch-$tool_version/bin/elasticsearch

##config kinbana
cat >> kibana-$tool_version-linux-x86_64/config/kibana.yml << EOF
elasticsearch.url: "http://localhost:9200"
server.host: 0.0.0.0
EOF
sh -x kibana-$tool_version-linux-x86_64/bin/kibana

##config filebeat
mv filebear-my-config.yml filebeat-$tool_version-linux-x86_64/
sudo filebeat-$tool_version-linux-x86_64/filebeat -e -c filebear-my-config.yml

#run the logstash
sh logstash-$tool_version/bin/logstash -f logstash-6.7.0/config/logstash-sample.conf