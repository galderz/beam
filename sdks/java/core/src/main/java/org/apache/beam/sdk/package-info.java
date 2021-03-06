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
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
/**
 * Provides a simple, powerful model for building both batch and
 * streaming parallel data processing
 * {@link org.apache.beam.sdk.Pipeline}s.
 *
 * <p>To use the Apache Beam SDK, you build a
 * {@link org.apache.beam.sdk.Pipeline}, which manages a graph of
 * {@link org.apache.beam.sdk.transforms.PTransform}s
 * and the {@link org.apache.beam.sdk.values.PCollection}s that
 * the PTransforms consume and produce.
 *
 * <p>Each Pipeline has a
 * {@link org.apache.beam.sdk.PipelineRunner} to specify
 * where and how it should run after pipeline construction is complete.
 *
 */
package org.apache.beam.sdk;
