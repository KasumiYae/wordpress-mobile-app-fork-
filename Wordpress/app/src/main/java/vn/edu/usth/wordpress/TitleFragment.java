package vn.edu.usth.wordpress;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import androidx.fragment.app.Fragment;

public class TitleFragment extends Fragment {

    private EditText titleInput;
    private Spinner categorySpinner, textFormatSpinner, toggleInputSpinner;
    private TextView dateDisplay, timeDisplay;
    private Switch allowCommentsSwitch, allowPingbacksSwitch, allowRepostSwitch;
    private Button deleteBlogButton;

    public TitleFragment() {
    }

    public static TitleFragment newInstance(String param1, String param2) {
        TitleFragment fragment = new TitleFragment();
        Bundle args = new Bundle();
        args.putString("param1", param1);
        args.putString("param2", param2);
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
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_title, container, false);


        titleInput = view.findViewById(R.id.title_input);
        categorySpinner = view.findViewById(R.id.category_spinner);
        textFormatSpinner = view.findViewById(R.id.text_format_spinner);
        toggleInputSpinner = view.findViewById(R.id.toggle_input_spinner);
        dateDisplay = view.findViewById(R.id.date_display);
        timeDisplay = view.findViewById(R.id.time_display);
        allowCommentsSwitch = view.findViewById(R.id.allow_comments_switch);
        allowPingbacksSwitch = view.findViewById(R.id.allow_pingbacks_switch);
        allowRepostSwitch = view.findViewById(R.id.allow_repost_switch);
        deleteBlogButton = view.findViewById(R.id.delete_blog_button);

        setDateAndTime();

        setupEventListeners();

        return view;
    }

    private void setDateAndTime() {
        dateDisplay.setText("Today");
        timeDisplay.setText("23:59");
    }

    private void setupEventListeners() {

        allowCommentsSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {

        });


        allowPingbacksSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {

        });

        allowRepostSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
        });


        deleteBlogButton.setOnClickListener(v -> {
        });
    }
}
