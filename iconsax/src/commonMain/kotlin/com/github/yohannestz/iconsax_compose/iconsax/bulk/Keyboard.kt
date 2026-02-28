package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Keyboard: ImageVector
    get() {
        val current = _keyboard
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Keyboard",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 18.27f, y = 3.35f)
                arcToRelative(a = 12.0f, b = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.77f, dy1 = -0.1f)
                horizontalLineToRelative(dx = -9.0f)
                arcToRelative(a = 13.0f, b = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.74f, dy1 = 0.09f)
                curveTo(x1 = 2.41f, y1 = 3.71f, x2 = 1.75f, y2 = 5.7f, x3 = 1.75f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.3f, dx2 = 0.66f, dy2 = 5.29f, dx3 = 3.98f, dy3 = 5.65f)
                arcToRelative(a = 12.0f, b = 12.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.77f, dy1 = 0.1f)
                horizontalLineToRelative(dx = 9.0f)
                curveToRelative(dx1 = 0.75f, dy1 = 0.0f, dx2 = 1.3f, dy2 = -0.03f, dx3 = 1.74f, dy3 = -0.09f)
                curveToRelative(dx1 = 3.35f, dy1 = -0.37f, dx2 = 4.01f, dy2 = -2.35f, dx3 = 4.01f, dy3 = -5.66f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.3f, dx2 = -0.66f, dy2 = -5.29f, dx3 = -3.98f, dy3 = -5.65f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.0f, y = 10.75f)
                horizontalLineToRelative(dx = -3.5f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineTo(x = 17.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveTo(x = 10.1f, y = 11.0f)
                curveToRelative(dx1 = -0.55f, dy1 = 0.0f, dx2 = -1.0f, dy2 = -0.45f, dx3 = -1.0f, dy3 = -1.0f)
                reflectiveCurveToRelative(dx1 = 0.44f, dy1 = -1.0f, dx2 = 1.0f, dy2 = -1.0f)
                horizontalLineToRelative(dx = 0.01f)
                curveToRelative(dx1 = 0.55f, dy1 = 0.0f, dx2 = 1.0f, dy2 = 0.45f, dx3 = 1.0f, dy3 = 1.0f)
                reflectiveCurveToRelative(dx1 = -0.45f, dy1 = 1.0f, dx2 = -1.01f, dy2 = 1.0f)
                moveToRelative(dx = -3.0f, dy = 0.0f)
                curveToRelative(dx1 = -0.55f, dy1 = 0.0f, dx2 = -1.0f, dy2 = -0.45f, dx3 = -1.0f, dy3 = -1.0f)
                reflectiveCurveToRelative(dx1 = 0.44f, dy1 = -1.0f, dx2 = 1.0f, dy2 = -1.0f)
                curveToRelative(dx1 = 0.55f, dy1 = 0.0f, dx2 = 1.0f, dy2 = 0.45f, dx3 = 1.0f, dy3 = 1.0f)
                reflectiveCurveToRelative(dx1 = -0.44f, dy1 = 1.0f, dx2 = -1.0f, dy2 = 1.0f)
                moveToRelative(dx = 9.9f, dy = 5.25f)
                horizontalLineTo(x = 7.02f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.76f, dy2 = -0.34f, dx3 = -0.76f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 6.59f, y1 = 14.75f, x2 = 7.0f, y2 = 14.75f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _keyboard = it }
    }

@Suppress("ObjectPropertyName")
private var _keyboard: ImageVector? = null
