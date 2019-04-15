package com.dangcong.toeicpratice;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.Toast;

public class PracticeFragment extends Fragment {

    ImageButton btnPart1, btnPart2, btnPart3, btnPart4, btnPart5, btnPart6, btnPart7, setting;


    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.frag_practice, container, false);

        btnPart1 = (ImageButton) view.findViewById(R.id.part_1);
        btnPart1.setOnClickListener(part1Clicked);

        btnPart2 = (ImageButton) view.findViewById(R.id.part_2);
        btnPart2.setOnClickListener(part2Clicked);

        btnPart3 = (ImageButton) view.findViewById(R.id.part_3);
        btnPart3.setOnClickListener(part3Clicked);

        btnPart4 = (ImageButton) view.findViewById(R.id.part_4);
        btnPart4.setOnClickListener(part4Clicked);

        btnPart5 = (ImageButton) view.findViewById(R.id.part_5);
        btnPart5.setOnClickListener(part5Clicked);

        btnPart6 = (ImageButton) view.findViewById(R.id.part_6);
        btnPart6.setOnClickListener(part6Clicked);

        btnPart7 = (ImageButton) view.findViewById(R.id.part_7);
        btnPart7.setOnClickListener(part7Clicked);

        setting = (ImageButton) view.findViewById(R.id.setting);
        setting.setOnClickListener(settingClicked);


        return view;
    }

    View.OnClickListener part1Clicked = new View.OnClickListener() {
        public void onClick(View view) {
            System.out.println("buttonImage da nhan pressed part 1 DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDddddddddd");
            Toast.makeText(getActivity(), "part 1", Toast.LENGTH_SHORT).show();
        }
    };

    View.OnClickListener part2Clicked = new View.OnClickListener() {
        public void onClick(View view) {
            System.out.println("buttonImage da nhan pressed part 1 DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDddddddddd");
            Toast.makeText(getActivity(), "part 1", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener part3Clicked = new View.OnClickListener() {
        public void onClick(View view) {
            System.out.println("buttonImage da nhan pressed part 1 DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDddddddddd");
            Toast.makeText(getActivity(), "part 1", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener part4Clicked = new View.OnClickListener() {
        public void onClick(View view) {
            System.out.println("buttonImage da nhan pressed part 1 DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDddddddddd");
            Toast.makeText(getActivity(), "part 1", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener part5Clicked = new View.OnClickListener() {
        public void onClick(View view) {
            System.out.println("buttonImage da nhan pressed part 1 DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDddddddddd");
            Toast.makeText(getActivity(), "part 1", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener part6Clicked = new View.OnClickListener() {
        public void onClick(View view) {
            System.out.println("buttonImage da nhan pressed part 1 DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDddddddddd");
            Toast.makeText(getActivity(), "part 6", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener part7Clicked = new View.OnClickListener() {
        public void onClick(View view) {
            System.out.println("buttonImage da nhan pressed part 1 DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDddddddddd");
            Toast.makeText(getActivity(), "part 7", Toast.LENGTH_SHORT).show();
        }
    };
    View.OnClickListener settingClicked = new View.OnClickListener() {
        public void onClick(View view) {
            System.out.println("buttonImage da nhan pressed part 1 DDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDDddddddddd");
            Toast.makeText(getActivity(), "setting", Toast.LENGTH_SHORT).show();
        }
    };
}
