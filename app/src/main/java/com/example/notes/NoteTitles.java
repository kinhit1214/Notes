package com.example.notes;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Locale;

public class NoteTitles extends Fragment {

    public NoteTitles() {
    }

    public static NoteTitles newInstance(String param1, String param2) {
        NoteTitles fragment = new NoteTitles();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {

        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_note_titles, container, false);
        view.findViewById(R.id.add).setOnClickListener(v -> {
            LinearLayout linear = (LinearLayout) view.findViewById(R.id.add_note);
            View viewBox = getLayoutInflater().inflate(R.layout.box, null);
            TextView noteTitle = (TextView) viewBox.findViewById(R.id.note_title);
            TextView noteTheme = (TextView) viewBox.findViewById(R.id.note_theme);
            TextView noteTime = (TextView) viewBox.findViewById(R.id.note_time);
            noteTitle.setText(String.format(Locale.getDefault(), "%s", "Title"));
            noteTheme.setText(String.format(Locale.getDefault(), "%s", "Title"));
            noteTime.setText(String.format(Locale.getDefault(), "%s", "Title"));
            linear.addView(viewBox);
        });
        return view;
    }
}