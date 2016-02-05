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

/** 
 * Simple api response data model for sentence determination requests 
 */
public final class SentencesResponse extends Response {

    private final List<String> sentences;

    /**
     * constructor for {@code SentencesResponse}
     * @param sentences list of sentences
     */
    public SentencesResponse(List<String> sentences) {
        this.sentences = sentences;
    }

    /**
     * get the list of sentences
     * @return the list of sentences
     */
    public List<String> getSentences() {
        return sentences;
    }

    @Override
    public int hashCode() {
        return sentences != null ? sentences.hashCode() : 0;
    }

    /**
     * if the param is a {@code SentencesResponse}, compare contents for equality
     * @param o the object
     * @return whether or not the param object is equal to this object
     */
    @Override
    public boolean equals(Object o) {
        if (!(o instanceof SentencesResponse)) {
            return false;
        }

        SentencesResponse that = (SentencesResponse) o;
        return sentences != null ? sentences.equals(that.getSentences()) : that.sentences == null;
    }
}
