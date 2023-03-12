package com.example.myapplicationenglish.activity.audioLessonsActivity;
import androidx.appcompat.app.AppCompatActivity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.example.myapplicationenglish.R;
import com.example.myapplicationenglish.activity.audioLesson.AudioLessonGet;
import com.example.myapplicationenglish.wordslessons.GenerationValue;

public class AudioLessonOneActivity extends AppCompatActivity {
    MediaPlayer mPlayer;
    GenerationValue generationValue = new GenerationValue();
    AudioLessonGet audioLessonGet = new AudioLessonGet();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_audio_lesson_one);
    }

    public void started() {
        audioLessonGet.initAudioLessonGet();
        int random = generationValue.generationValue(audioLessonGet.audioLessonGet.size());
        mPlayer = MediaPlayer.create(this, audioLessonGet.audioLessonGet.get(random));
        mPlayer.start();
        mPlayer.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
            @Override
            public void onCompletion(MediaPlayer mediaPlayer) {
                started();
            }
        });
    }

    public void startAudioLessonOne(View view) {
        started();
    }

    private void stopPlay() {
        mPlayer.stop();
        try {
            mPlayer.prepare();
            mPlayer.seekTo(0);
        } catch (Throwable t) {
            Toast.makeText(this, t.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }

    public void stop(View view) {
        stopPlay();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (mPlayer.isPlaying()) {
            stopPlay();
        }
    }
}