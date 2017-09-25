package edu.orangecoastcollege.cs273.phuynh101.inandout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;
import java.util.Locale;

/**
 * SummaryActivity summarizes what was ordered
 */
public class SummaryActivity extends AppCompatActivity {

    private TextView mTotalTextView;
    private TextView mItemsOrderedTextView;
    private TextView mSubtotalTextView;
    private TextView mTaxTextView;

    private NumberFormat mNumberFormat = NumberFormat.getCurrencyInstance(Locale.US);

    /**
     * establishes connections from View to the Controller
     *
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);

        mTotalTextView = (TextView) findViewById(R.id.totalTextView);
        mItemsOrderedTextView = (TextView) findViewById(R.id.itemsOrderedTextView);
        mSubtotalTextView = (TextView) findViewById(R.id.subtotalTextView);
        mTaxTextView = (TextView) findViewById(R.id.taxTextView);

        Intent mIntent = getIntent();
        mTotalTextView.setText(getString(R.string.order_total_summary) + mNumberFormat.format(mIntent.getDoubleExtra("total", 0.0)));
        mItemsOrderedTextView.setText(getString(R.string.items_ordered_summary) + String.valueOf(mIntent.getIntExtra("items ordered", 0)));
        mSubtotalTextView.setText(getString(R.string.subtotal_summary) + mNumberFormat.format(mIntent.getDoubleExtra("subtotal", 0.0)));
        mTaxTextView.setText(getString(R.string.tax_summary) + "(" + Order.TAX_RATE * 100 + "%): " +
                mNumberFormat.format(mIntent.getDoubleExtra("tax", 0.08)));
    }

    /**
     * back to the OrderActivity
     *
     * @param v the view that triggers the event
     */
    protected void startNewOrder(View v) {
        finish();
    }
}
