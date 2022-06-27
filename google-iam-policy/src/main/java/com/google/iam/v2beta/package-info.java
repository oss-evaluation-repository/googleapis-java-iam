/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

/**
 * A client to Identity and Access Management (IAM) API
 *
 * <p>The interfaces provided are listed below, along with usage samples.
 *
 * <p>======================= PoliciesClient =======================
 *
 * <p>Service Description: An interface for managing Identity and Access Management (IAM) policies.
 *
 * <p>Sample for PoliciesClient:
 *
 * <pre>{@code
 * // This snippet has been automatically generated for illustrative purposes only.
 * // It may require modifications to work in your environment.
 * try (PoliciesClient policiesClient = PoliciesClient.create()) {
 *   PolicyName name = PolicyName.of("[POLICY]");
 *   Policy response = policiesClient.getPolicy(name);
 * }
 * }</pre>
 */
@Generated("by gapic-generator-java")
package com.google.iam.v2beta;

import javax.annotation.Generated;