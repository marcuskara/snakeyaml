package org.jvyaml.events;

import junit.framework.TestCase;

import org.yaml.snakeyaml.events.ScalarEvent;

public class ScalarEventTest extends TestCase {

    public void testToString() {
        boolean[] implicit = new boolean[2];
        implicit[0] = true;
        implicit[1] = true;
        ScalarEvent event = new ScalarEvent("a2", "str", implicit, "text", null, null, '"');
        assertEquals(
                "<org.yaml.snakeyaml.events.ScalarEvent(anchor=a2, tag=str, implicit=[true, true], value=text)>",
                event.toString());
    }

}
