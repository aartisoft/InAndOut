package edu.orangecoastcollege.cs273.phuynh101.inandout;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

/**
 * OrderActivity lets users order food and drinks
 */
public class OrderActivity extends AppCompatActivity {

    private EditText mDoubleDoubleEditText;
    private EditText mCheeseburgerEditText;
    private EditText mFrenchFriesEditText;
    private EditText mShakeEditText;
    private EditText mSmallDrinkEditText;
    private EditText mMediumDrinkEditText;
    private EditText mLargeDrinkEditText;

    private Order mOrder = new Order();

    /**
     * establishes connections from View to Controller
     * and from Model to Controller
     *
     * @param savedInstanceState settings from the previous state
     */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_order);

        mDoubleDoubleEditText = (EditText) findViewById(R.id.doubleDoubleEditText);
        mCheeseburgerEditText = (EditText) findViewById(R.id.cheeseburgerEditText);
        mFrenchFriesEditText = (EditText) findViewById(R.id.frenchFriesEditText);
        mShakeEditText = (EditText) findViewById(R.id.shakeEditText);
        mSmallDrinkEditText = (EditText) findViewById(R.id.smallDrinkEditText);
        mMediumDrinkEditText = (EditText) findViewById(R.id.mediumDrinkEditText);
        mLargeDrinkEditText = (EditText) findViewById(R.id.largeDrinkEditText);
    }

    /**
     * place order
     *
     * @param v view that triggers the event
     */
    protected void placeOrderButton(View v) {
        try {
            mOrder.setDoubleDoubles(Integer.parseInt(mDoubleDoubleEditText.getText().toString()));
        } catch (NumberFormatException e) {
            mOrder.setDoubleDoubles(0);
        }

        try {
            mOrder.setCheeseBurgers(Integer.parseInt(mCheeseburgerEditText.getText().toString()));
        } catch (NumberFormatException e) {
            mOrder.setCheeseBurgers(0);
        }

        try {
            mOrder.setFrenchFries(Integer.parseInt(mFrenchFriesEditText.getText().toString()));
        } catch (NumberFormatException e) {
            mOrder.setFrenchFries(0);
        }

        try {
            mOrder.setShakes(Integer.parseInt(mShakeEditText.getText().toString()));
        } catch (NumberFormatException e) {
            mOrder.setShakes(0);
        }

        try {
            mOrder.setSmallDrinks(Integer.parseInt(mSmallDrinkEditText.getText().toString()));
        } catch (NumberFormatException e) {
            mOrder.setSmallDrinks(0);
        }

        try {
            mOrder.setMediumDrinks(Integer.parseInt(mMediumDrinkEditText.getText().toString()));
        } catch (NumberFormatException e) {
            mOrder.setMediumDrinks(0);
        }

        try {
            mOrder.setLargeDrinks(Integer.parseInt(mLargeDrinkEditText.getText().toString()));
        } catch (NumberFormatException e) {
            mOrder.setLargeDrinks(0);
        }

        Intent mIntent = new Intent(this, SummaryActivity.class);
        mIntent.putExtra("total", mOrder.calculateTotal());
        mIntent.putExtra("items ordered", mOrder.getNumberItemsOrdered());
        mIntent.putExtra("subtotal", mOrder.calculateSubtotal());
        mIntent.putExtra("tax", mOrder.calculateTax());
        startActivity(mIntent);
    }
}
