// Generated by view binder compiler. Do not edit!
package com.recipe.search.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.recipe.search.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivitySignUpBinding implements ViewBinding {
  @NonNull
  private final ScrollView rootView;

  @NonNull
  public final AppCompatButton btnCreateAccount;

  @NonNull
  public final AppCompatEditText etPin;

  @NonNull
  public final AppCompatEditText etPinConfirm;

  @NonNull
  public final AppCompatEditText etUserEmail;

  @NonNull
  public final AppCompatEditText etUserName;

  @NonNull
  public final Guideline guidelineLeft;

  @NonNull
  public final Guideline guidelineRight;

  @NonNull
  public final AppCompatImageView ivLogo;

  @NonNull
  public final AppCompatImageView ivPinVisibility;

  @NonNull
  public final AppCompatImageView ivPinVisibilityConfirm;

  @NonNull
  public final LinearLayout linearLayout;

  @NonNull
  public final ConstraintLayout llPin;

  @NonNull
  public final ConstraintLayout llPinConfirm;

  private ActivitySignUpBinding(@NonNull ScrollView rootView,
      @NonNull AppCompatButton btnCreateAccount, @NonNull AppCompatEditText etPin,
      @NonNull AppCompatEditText etPinConfirm, @NonNull AppCompatEditText etUserEmail,
      @NonNull AppCompatEditText etUserName, @NonNull Guideline guidelineLeft,
      @NonNull Guideline guidelineRight, @NonNull AppCompatImageView ivLogo,
      @NonNull AppCompatImageView ivPinVisibility,
      @NonNull AppCompatImageView ivPinVisibilityConfirm, @NonNull LinearLayout linearLayout,
      @NonNull ConstraintLayout llPin, @NonNull ConstraintLayout llPinConfirm) {
    this.rootView = rootView;
    this.btnCreateAccount = btnCreateAccount;
    this.etPin = etPin;
    this.etPinConfirm = etPinConfirm;
    this.etUserEmail = etUserEmail;
    this.etUserName = etUserName;
    this.guidelineLeft = guidelineLeft;
    this.guidelineRight = guidelineRight;
    this.ivLogo = ivLogo;
    this.ivPinVisibility = ivPinVisibility;
    this.ivPinVisibilityConfirm = ivPinVisibilityConfirm;
    this.linearLayout = linearLayout;
    this.llPin = llPin;
    this.llPinConfirm = llPinConfirm;
  }

  @Override
  @NonNull
  public ScrollView getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivitySignUpBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_sign_up, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivitySignUpBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.btn_create_account;
      AppCompatButton btnCreateAccount = ViewBindings.findChildViewById(rootView, id);
      if (btnCreateAccount == null) {
        break missingId;
      }

      id = R.id.et_pin;
      AppCompatEditText etPin = ViewBindings.findChildViewById(rootView, id);
      if (etPin == null) {
        break missingId;
      }

      id = R.id.et_pin_confirm;
      AppCompatEditText etPinConfirm = ViewBindings.findChildViewById(rootView, id);
      if (etPinConfirm == null) {
        break missingId;
      }

      id = R.id.et_user_email;
      AppCompatEditText etUserEmail = ViewBindings.findChildViewById(rootView, id);
      if (etUserEmail == null) {
        break missingId;
      }

      id = R.id.et_user_name;
      AppCompatEditText etUserName = ViewBindings.findChildViewById(rootView, id);
      if (etUserName == null) {
        break missingId;
      }

      id = R.id.guideline_left;
      Guideline guidelineLeft = ViewBindings.findChildViewById(rootView, id);
      if (guidelineLeft == null) {
        break missingId;
      }

      id = R.id.guideline_right;
      Guideline guidelineRight = ViewBindings.findChildViewById(rootView, id);
      if (guidelineRight == null) {
        break missingId;
      }

      id = R.id.iv_logo;
      AppCompatImageView ivLogo = ViewBindings.findChildViewById(rootView, id);
      if (ivLogo == null) {
        break missingId;
      }

      id = R.id.iv_pin_visibility;
      AppCompatImageView ivPinVisibility = ViewBindings.findChildViewById(rootView, id);
      if (ivPinVisibility == null) {
        break missingId;
      }

      id = R.id.iv_pin_visibility_confirm;
      AppCompatImageView ivPinVisibilityConfirm = ViewBindings.findChildViewById(rootView, id);
      if (ivPinVisibilityConfirm == null) {
        break missingId;
      }

      id = R.id.linearLayout;
      LinearLayout linearLayout = ViewBindings.findChildViewById(rootView, id);
      if (linearLayout == null) {
        break missingId;
      }

      id = R.id.ll_pin;
      ConstraintLayout llPin = ViewBindings.findChildViewById(rootView, id);
      if (llPin == null) {
        break missingId;
      }

      id = R.id.ll_pin_confirm;
      ConstraintLayout llPinConfirm = ViewBindings.findChildViewById(rootView, id);
      if (llPinConfirm == null) {
        break missingId;
      }

      return new ActivitySignUpBinding((ScrollView) rootView, btnCreateAccount, etPin, etPinConfirm,
          etUserEmail, etUserName, guidelineLeft, guidelineRight, ivLogo, ivPinVisibility,
          ivPinVisibilityConfirm, linearLayout, llPin, llPinConfirm);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
