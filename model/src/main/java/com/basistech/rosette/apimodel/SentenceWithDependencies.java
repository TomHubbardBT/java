/*
* Copyright 2014 Basis Technology Corp.
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

import java.util.List;
import java.util.Objects;

public class SentenceWithDependencies {
    private final Integer startOffset;
    private final Integer endOffset;
    private final List<Dependency> dependencies;

    public SentenceWithDependencies(Integer startOffset, Integer endOffset, List<Dependency> dependencies) {
        this.startOffset = startOffset;
        this.endOffset = endOffset;
        this.dependencies = dependencies;
    }

    public Integer getStartOffset() {
        return startOffset;
    }

    public Integer getEndOffset() {
        return endOffset;
    }

    public List<Dependency> getDependencies() {
        return dependencies;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } else if (o != null && this.getClass() == o.getClass()) {
            SentenceWithDependencies that = (SentenceWithDependencies)o;
            return Objects.equals(this.startOffset, that.startOffset)
                    && Objects.equals(this.endOffset, that.endOffset)
                    && Objects.equals(this.dependencies, that.dependencies);
        } else {
            return false;
        }
    }

    public int hashCode() {
        return Objects.hash(this.startOffset, this.endOffset, this.dependencies);
    }
}
