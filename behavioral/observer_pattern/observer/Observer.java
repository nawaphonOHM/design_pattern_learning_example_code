package behavioral.observer_pattern.observer;

import behavioral.observer_pattern.others.板球;

public interface Observer {
    public void 更新する(板球 newCricket);
}