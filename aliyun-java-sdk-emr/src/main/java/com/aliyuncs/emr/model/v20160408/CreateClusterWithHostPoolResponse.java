/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.emr.model.v20160408;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.emr.transform.v20160408.CreateClusterWithHostPoolResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class CreateClusterWithHostPoolResponse extends AcsResponse {

	private String requestId;

	private String clusterId;

	private String workFlowInstanceId;

	private String operationId;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public String getClusterId() {
		return this.clusterId;
	}

	public void setClusterId(String clusterId) {
		this.clusterId = clusterId;
	}

	public String getWorkFlowInstanceId() {
		return this.workFlowInstanceId;
	}

	public void setWorkFlowInstanceId(String workFlowInstanceId) {
		this.workFlowInstanceId = workFlowInstanceId;
	}

	public String getOperationId() {
		return this.operationId;
	}

	public void setOperationId(String operationId) {
		this.operationId = operationId;
	}

	@Override
	public CreateClusterWithHostPoolResponse getInstance(UnmarshallerContext context) {
		return	CreateClusterWithHostPoolResponseUnmarshaller.unmarshall(this, context);
	}
}