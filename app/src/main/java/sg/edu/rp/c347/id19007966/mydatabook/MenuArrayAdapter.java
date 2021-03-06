package sg.edu.rp.c347.id19007966.mydatabook;

import android.content.Context;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MenuArrayAdapter extends ArrayAdapter<String> {

    ImageView iv;
    TextView tvCategory;

    private final Context context;
    private final String [] values;

    public MenuArrayAdapter(@NonNull Context context, int resource, String[] values) {
        super(context, resource, values);
        this.context = context;
        this.values = values;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row, parent, false);

        iv = rowView.findViewById(R.id.iv);
        tvCategory = rowView.findViewById(R.id.tvCategory);

        tvCategory.setText(values[position]);

        String pos = values[position];
        if (pos.startsWith("Bio")){
            iv.setImageResource(android.R.drawable.ic_dialog_info);
        }
        else if(pos.startsWith("Vacc")){
            iv.setImageResource(android.R.drawable.ic_menu_edit);
        }
        else if(pos.startsWith("Anni")){
            iv.setImageResource(android.R.drawable.ic_menu_my_calendar);
        }
        else if(pos.startsWith("About")){
            iv.setImageResource(android.R.drawable.star_big_on);
        }

        return rowView;
    }
}

