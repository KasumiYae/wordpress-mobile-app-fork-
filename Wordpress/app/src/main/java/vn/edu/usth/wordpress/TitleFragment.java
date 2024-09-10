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
        // Required empty public constructor
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
            // Retrieve parameters if any
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_title, container, false);

        // Initialize views
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

        // Set up initial values for date and time displays
        setDateAndTime();

        // Set up event listeners for switches and buttons
        setupEventListeners();

        return view;
    }

    private void setDateAndTime() {
        // Set the current date and time
        dateDisplay.setText("Hôm nay");  // Can be set dynamically with the actual current date
        timeDisplay.setText("23:59");    // Can be set dynamically with the actual current time
    }

    private void setupEventListeners() {
        // Handle comment switch
        allowCommentsSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            // Handle allowing comments
        });

        // Handle pingback switch
        allowPingbacksSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            // Handle allowing pingbacks
        });

        // Handle repost switch
        allowRepostSwitch.setOnCheckedChangeListener((buttonView, isChecked) -> {
            // Handle allowing reposts
        });

        // Handle delete blog button click
        deleteBlogButton.setOnClickListener(v -> {
            // Handle deleting the blog
        });
    }
}
