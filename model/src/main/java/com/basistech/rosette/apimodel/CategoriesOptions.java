/*
* Copyright 2017 Basis Technology Corp.
*
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

package com.basistech.rosette.apimodel;

import com.basistech.rosette.annotations.JacksonMixin;
import lombok.Builder;
import lombok.Value;

import javax.validation.constraints.Min;

/**
 * Categorization options 
 */
@Value
@Builder
@JacksonMixin
public class CategoriesOptions extends Options {

    /**
     * @deprecated
     * users should use {@link singleLabel} to return only one result
     * or {@link scoreThreshold} to filter results based on raw score
     * @return number of categories
     */
    @Min(1)
    private final Integer numCategories;

    /**
     * Single label mode will return only the highest scoring category
     * @return whether or not we are in single label mode
     */
    private final boolean singleLabel;

    /**
     * threshold against the category's raw score, whose value
     * can be any real number.
     * @return the score threshold
     */
    private final Float scoreThreshold;
}
