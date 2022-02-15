
package baritone.api.behavior;

import baritone.api.utils.Rotation;

public interface ILookBehavior extends IBehavior {
    void updateTarget(Rotation rotation, boolean force);
}
