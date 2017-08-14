/*
 * Copyright (c) 2017 seleniumQuery authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.github.seleniumquery.by.secondgen.parser.ast.condition.attribute;

import io.github.seleniumquery.by.secondgen.parser.ast.condition.AstCssConditionVisitor;

public class AstCssEqualsOrHasAttributeCondition extends AstCssAttributeConditionBase {

    /*
     * [simple]
     * Attribute value is null in this case.
     */
    public AstCssEqualsOrHasAttributeCondition(String attributeName) {
        this(attributeName, null);
    }

    /*
     * [restart="never"]
     */
    public AstCssEqualsOrHasAttributeCondition(String attributeName, String wantedValue) {
        super(attributeName, wantedValue);
    }

    @Override
    public <T> T accept(AstCssConditionVisitor<T> visitor) {
        return visitor.visit(this);
    }

}
