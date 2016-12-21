/**
 * Copyright (C) 2013-2016 Vasilis Vryniotis <bbriniotis@datumbox.com>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.datumbox.framework.core.machinelearning.common.abstracts.modelers;

import com.datumbox.framework.common.Configuration;
import com.datumbox.framework.core.machinelearning.common.abstracts.AbstractTrainer;

/**
 * Base Class for all the Regression algorithms.
 *
 * @author Vasilis Vryniotis <bbriniotis@datumbox.com>
 * @param <MP>
 * @param <TP>
 */
public abstract class AbstractRegressor<MP extends AbstractRegressor.AbstractModelParameters, TP extends AbstractRegressor.AbstractTrainingParameters> extends AbstractModeler<MP, TP> {

    /**
     * @param trainingParameters
     * @param conf
     * @see AbstractTrainer#AbstractTrainer(AbstractTrainingParameters, Configuration)
     */
    protected AbstractRegressor(TP trainingParameters, Configuration conf) {
        super(trainingParameters, conf);
    }

    /**
     * @param dbName
     * @param conf
     * @see AbstractTrainer#AbstractTrainer(String, Configuration)
     */
    protected AbstractRegressor(String dbName, Configuration conf) {
        super(dbName, conf);
    }


}