package com.applicationlifecycle.sample;

import com.badlogic.gdx.Application;
import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.utils.Logger;

public class ApplicationLifecycle implements ApplicationListener
    {
        private static final Logger LOGGER_INFO  = new Logger ( ApplicationLifecycle.class.getName () , Logger.INFO );
//        private static final Logger LOGGER_DEBUG = new Logger ( ApplicationLifecycle.class.getName () , Logger.DEBUG );
        private static       long   renderCalls;
        SpriteBatch batch;
        Texture     img;

        @Override
        public void create ()
            {
//                Gdx.app.setLogLevel ( Application.LOG_DEBUG );
                LOGGER_INFO.info ( " create() called" );
                batch = new SpriteBatch ();
                img = new Texture ( "badlogic.jpg" );
                LOGGER_INFO.info ( " create() ended" );
//                LOGGER_DEBUG.debug ( "test" );
            }

        @Override
        public void resize ( int width , int height )
            {
                LOGGER_INFO.info ( " resize() called width = " + width + " height = " + height );
            }

        @Override
        public void render ()
            {
                renderCalls++;
                if ( ( renderCalls % 300 ) == 0 )
                    {
                        LOGGER_INFO.info ( " render called " + renderCalls + " times" );
                    }
                Gdx.gl.glClearColor ( 1 , 0 , 0 , 1 );
                Gdx.gl.glClear ( GL20.GL_COLOR_BUFFER_BIT );
                batch.begin ();
                batch.draw ( img , 0 , 0 );
                batch.end ();
            }

        @Override
        public void pause ()
            {
                LOGGER_INFO.info ( " pause() called" );
            }

        @Override
        public void resume ()
            {
                LOGGER_INFO.info ( " resume() called" );
            }

        @Override
        public void dispose ()
            {
                LOGGER_INFO.info ( " dispose() called" );
                batch.dispose ();
                img.dispose ();
            }
    }
