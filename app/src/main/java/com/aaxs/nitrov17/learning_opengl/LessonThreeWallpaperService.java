package com.aaxs.nitrov17.learning_opengl;

import android.opengl.GLSurfaceView;

/**
 * Created by NitroV17 on 1/2/2017.
 */

public class LessonThreeWallpaperService extends OpenGLES2WallpaperService {
    @Override
    GLSurfaceView.Renderer getNewRenderer() {
        return new LessonThreeRenderer();
    }
}
