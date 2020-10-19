/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.apache.dolphinscheduler.dao.entity;

import java.util.Date;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;


/**
 * process definition version
 */
@TableName("t_ds_process_definition_version")
public class ProcessDefinitionVersion {

    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private int id;

    /**
     * process definition code
     */
    private String processDefinitionCode;

    /**
     * version
     */
    private long version;

    /**
     * definition json string
     */
    private String processDefinitionJson;

    /**
     * description
     */
    private String description;

    /**
     * receivers
     */
    private String receivers;

    /**
     * receivers cc
     */
    private String receiversCc;

    /**
     * process warning time out. unit: minute
     */
    private int timeout;

    /**
     * resource codes
     */
    private String resourceCodes;

    /**
     * create time
     */
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date createTime;

    /**
     * user defined parameters
     */
    private String globalParams;

    /**
     * locations array for web
     */
    private String locations;

    /**
     * connects array for web
     */
    private String connects;

    public String getGlobalParams() {
        return globalParams;
    }

    public void setGlobalParams(String globalParams) {
        this.globalParams = globalParams;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProcessDefinitionCode() {
        return processDefinitionCode;
    }

    public void setProcessDefinitionCode(String processDefinitionCode) {
        this.processDefinitionCode = processDefinitionCode;
    }

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public String getProcessDefinitionJson() {
        return processDefinitionJson;
    }

    public void setProcessDefinitionJson(String processDefinitionJson) {
        this.processDefinitionJson = processDefinitionJson;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getLocations() {
        return locations;
    }

    public void setLocations(String locations) {
        this.locations = locations;
    }

    public String getConnects() {
        return connects;
    }

    public void setConnects(String connects) {
        this.connects = connects;
    }

    public String getReceivers() {
        return receivers;
    }

    public void setReceivers(String receivers) {
        this.receivers = receivers;
    }

    public String getReceiversCc() {
        return receiversCc;
    }

    public void setReceiversCc(String receiversCc) {
        this.receiversCc = receiversCc;
    }

    public int getTimeout() {
        return timeout;
    }

    public void setTimeout(int timeout) {
        this.timeout = timeout;
    }

    public String getResourceCodes() {
        return resourceCodes;
    }

    public void setResourceCodes(String resourceCodes) {
        this.resourceCodes = resourceCodes;
    }

    @Override
    public String toString() {
        return "ProcessDefinitionVersion{"
                + "id=" + id
                + ", processDefinitionCode='" + processDefinitionCode + '\''
                + ", version=" + version
                + ", processDefinitionJson='" + processDefinitionJson + '\''
                + ", description='" + description + '\''
                + ", globalParams='" + globalParams + '\''
                + ", createTime=" + createTime
                + ", locations='" + locations + '\''
                + ", connects='" + connects + '\''
                + ", receivers='" + receivers + '\''
                + ", receiversCc='" + receiversCc + '\''
                + ", timeout=" + timeout
                + ", resourceCodes='" + resourceCodes + '\''
                + '}';
    }

    public static Builder newBuilder() {
        return new Builder();
    }

    public static final class Builder {
        private int id;
        private String processDefinitionCode;
        private long version;
        private String processDefinitionJson;
        private String description;
        private String globalParams;
        private Date createTime;
        private String locations;
        private String connects;
        private String receivers;
        private String receiversCc;
        private int timeout;
        private String resourceCodes;

        private Builder() {
        }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder processDefinitionCode(String processDefinitionCode) {
            this.processDefinitionCode = processDefinitionCode;
            return this;
        }

        public Builder version(long version) {
            this.version = version;
            return this;
        }

        public Builder processDefinitionJson(String processDefinitionJson) {
            this.processDefinitionJson = processDefinitionJson;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder globalParams(String globalParams) {
            this.globalParams = globalParams;
            return this;
        }

        public Builder createTime(Date createTime) {
            this.createTime = createTime;
            return this;
        }

        public Builder locations(String locations) {
            this.locations = locations;
            return this;
        }

        public Builder connects(String connects) {
            this.connects = connects;
            return this;
        }

        public Builder receivers(String receivers) {
            this.receivers = receivers;
            return this;
        }

        public Builder receiversCc(String receiversCc) {
            this.receiversCc = receiversCc;
            return this;
        }

        public Builder timeout(int timeout) {
            this.timeout = timeout;
            return this;
        }

        public Builder resourceCodes(String resourceCodes) {
            this.resourceCodes = resourceCodes;
            return this;
        }

        public ProcessDefinitionVersion build() {
            ProcessDefinitionVersion processDefinitionVersion = new ProcessDefinitionVersion();
            processDefinitionVersion.setId(id);
            processDefinitionVersion.setProcessDefinitionCode(processDefinitionCode);
            processDefinitionVersion.setVersion(version);
            processDefinitionVersion.setProcessDefinitionJson(processDefinitionJson);
            processDefinitionVersion.setDescription(description);
            processDefinitionVersion.setGlobalParams(globalParams);
            processDefinitionVersion.setCreateTime(createTime);
            processDefinitionVersion.setLocations(locations);
            processDefinitionVersion.setConnects(connects);
            processDefinitionVersion.setReceivers(receivers);
            processDefinitionVersion.setReceiversCc(receiversCc);
            processDefinitionVersion.setTimeout(timeout);
            processDefinitionVersion.setResourceCodes(resourceCodes);
            return processDefinitionVersion;
        }
    }
}
