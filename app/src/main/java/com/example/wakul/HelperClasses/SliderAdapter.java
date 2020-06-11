package com.example.wakul.HelperClasses;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager.widget.PagerAdapter;

import com.example.wakul.R;

public class SliderAdapter extends PagerAdapter {

    Context context;
    LayoutInflater layoutInflater;

    public SliderAdapter(Context context) {
        this.context = context;
    }

 int image[] ={
         R.drawable.baru,
         R.drawable.logo_baru
 };
    int headings[] = {
            R.string.first_slide_title,
            R.string.second_slide_title
    };

    int descriptions[] = {
       R.string.first_slide_desc,
       R.string.second_slide_desc
    };


    @Override
    public int getCount() {
        return headings.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return view == (ConstraintLayout) object;
    }

    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {

        layoutInflater = (LayoutInflater) context.getSystemService((context.LAYOUT_INFLATER_SERVICE));
        View view = layoutInflater.inflate(R.layout.slide_layout,container,false);

        //Hooks
        ImageView imageView = view.findViewById(R.id.imageView);
        TextView heading = view.findViewById(R.id.slider_heading);
        TextView desk = view.findViewById(R.id.slider_desk);

        imageView.setImageResource(image[position]);
        heading.setText(headings[position]);
        desk.setText(descriptions[position]);

        container.addView(view);

        return view;
    }

    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((ConstraintLayout)object);
    }
}
