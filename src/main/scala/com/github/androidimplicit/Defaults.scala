package com.github.shoscala.androidimplicit

import android.graphics._
import android.graphics.BitmapFactory.Options
import android.os.Bundle
import android.support.v4.app._
import android.support.v4.view._
import android.text._
import android.view._
import android.widget._
import android.widget.TextView.OnEditorActionListener

object Defaults {

  implicit class RichImageView(imageView: ImageView) {
    def withImageMatrix(matrix: Matrix) = {
      imageView.setImageMatrix(matrix)
      imageView
    }
  }

  implicit class RichTextView(textView: TextView) {

    def withOnEditorActionListener(l: OnEditorActionListener): TextView = {
      textView.setOnEditorActionListener(l)
      textView
    }

    def withOnEditorAction(f: (TextView, Int, KeyEvent) => Boolean): TextView = {
      withOnEditorActionListener(new OnEditorActionListener {
        override def onEditorAction(v: TextView, actionId: Int, event: KeyEvent): Boolean = f(v, actionId, event)
      })
    }

    def withTextChangedListener(watcher:TextWatcher): TextView = {
      textView.addTextChangedListener(watcher)
      textView
    }

    def withFilters(filters:Array[InputFilter]):TextView={
      textView.setFilters(filters)
      textView
    }

    def withMaxLines(maxlines: Int): TextView = {
      textView.setMaxLines(maxlines)
      textView
    }

    def withLines(lines: Int): TextView = {
      textView.setLines(lines)
      textView
    }

    def withText(text: CharSequence) = {
      textView.setText(text)
      textView
    }

    def withTextColor(color: Int) = {
      textView.setTextColor(color)
      textView
    }

    def withRawInputType(typ: Int): TextView = {
      textView.setRawInputType(typ)
      textView
    }

    def withImeOptions(typ: Int): TextView = {
      textView.setImeOptions(typ)
      textView
    }
  }

  implicit class RichViewGroup(viewGroup: ViewGroup) {
    def withView(view: View) = {
      viewGroup.addView(view)
      viewGroup
    }
  }

  implicit class RichView[T <: View](view: T) {
    def withId(id: Int) = {
      view.setId(id)
      view
    }

    def withLayoutParams(layoutParams: ViewGroup.LayoutParams) = {
      view.setLayoutParams(layoutParams)
      view
    }

    def withBackgroundColor(color: Int) = {
      view.setBackgroundColor(color)
      view
    }
  }

  implicit class RichBundle(bundle: Bundle) {
    def withInt(key: String, value: Int) = {
      bundle.putInt(key, value)
      bundle
    }

    def withString(key: String, value: String) = {
      bundle.putString(key, value)
      bundle
    }
  }

  implicit class RichFragment[T <: Fragment](fragment: T) {
    def withArguments(args: Bundle) = {
      fragment.setArguments(args)
      fragment
    }
  }

  implicit class RichViewPager(viewPager: ViewPager) {
    def withId(id: Int) = {
      viewPager.setId(id)
      viewPager
    }

    def withAdapter(adapter: PagerAdapter) = {
      viewPager.setAdapter(adapter)
      viewPager
    }
  }

  implicit class RichMatrix(matrix: Matrix) {
    def withRotate(degrees: Float): Matrix = {
      matrix.setRotate(degrees)
      matrix
    }

    def withPostRotate(degrees: Float): Matrix = {
      matrix.postRotate(degrees)
      matrix
    }

    def withScale(sx: Float, sy: Float): Matrix = {
      matrix.setScale(sx, sy)
      matrix
    }

    def withPostScale(sx: Float, sy: Float): Matrix = {
      matrix.postScale(sx, sy)
      matrix
    }

    def withPostScale(sx: Float, sy: Float, px: Float, py: Float): Matrix = {
      matrix.postScale(sx, sy, px, py)
      matrix
    }
  }

  implicit class RichOptions(options: Options) {
    def withInJustDecodeBounds(inJustDecodeBounds: Boolean) = {
      options.inJustDecodeBounds = inJustDecodeBounds
      options
    }

    def withInSampleSize(inSampleSize: Int) = {
      options.inSampleSize = inSampleSize
      options
    }
  }
}