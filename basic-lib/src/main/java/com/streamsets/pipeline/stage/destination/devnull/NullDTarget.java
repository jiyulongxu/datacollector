/**
 * (c) 2014 StreamSets, Inc. All rights reserved. May not
 * be copied, modified, or distributed in whole or part without
 * written consent of StreamSets, Inc.
 */
package com.streamsets.pipeline.stage.destination.devnull;

import com.streamsets.pipeline.api.GenerateResourceBundle;
import com.streamsets.pipeline.api.HideConfig;
import com.streamsets.pipeline.api.StageDef;
import com.streamsets.pipeline.api.Target;
import com.streamsets.pipeline.configurablestage.DTarget;

@StageDef(
    version = 1,
    label = "Trash",
    icon="trash.png",
    description = "Discards records"
)
@HideConfig(preconditions = true, onErrorRecord = true)
@GenerateResourceBundle
public class NullDTarget extends DTarget {

  @Override
  protected Target createTarget() {
    return new NullTarget();
  }
}
