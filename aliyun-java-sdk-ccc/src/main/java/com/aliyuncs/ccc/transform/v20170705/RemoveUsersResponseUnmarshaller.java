/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package com.aliyuncs.ccc.transform.v20170705;

import com.aliyuncs.ccc.model.v20170705.RemoveUsersResponse;
import com.aliyuncs.transform.UnmarshallerContext;


public class RemoveUsersResponseUnmarshaller {

	public static RemoveUsersResponse unmarshall(RemoveUsersResponse removeUsersResponse, UnmarshallerContext context) {
		
		removeUsersResponse.setRequestId(context.stringValue("RemoveUsersResponse.RequestId"));
		removeUsersResponse.setSuccess(context.booleanValue("RemoveUsersResponse.Success"));
		removeUsersResponse.setCode(context.stringValue("RemoveUsersResponse.Code"));
		removeUsersResponse.setMessage(context.stringValue("RemoveUsersResponse.Message"));
		removeUsersResponse.setHttpStatusCode(context.integerValue("RemoveUsersResponse.HttpStatusCode"));
	 
	 	return removeUsersResponse;
	}
}