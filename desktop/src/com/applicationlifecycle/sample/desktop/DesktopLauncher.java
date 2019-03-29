package com.applicationlifecycle.sample.desktop;

import com.applicationlifecycle.sample.ApplicationLifecycle;
import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class DesktopLauncher
    {
        public static void main ( String[] arg )
            {
                LwjglApplicationConfiguration config = new LwjglApplicationConfiguration ();
                new LwjglApplication ( new ApplicationLifecycle () , config );
            }
    }
