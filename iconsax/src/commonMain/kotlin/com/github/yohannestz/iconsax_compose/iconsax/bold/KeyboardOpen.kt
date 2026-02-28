package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val KeyboardOpen: ImageVector
    get() {
        val current = _keyboardOpen
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.KeyboardOpen",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.0f, y = 22.75f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 6.59f, y1 = 21.25f, x2 = 7.0f, y2 = 21.25f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveTo(x = 18.0f, y = 2.0f)
                horizontalLineTo(x = 6.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.0f, dy1 = 4.0f)
                verticalLineToRelative(dy = 9.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.0f, dy1 = 4.0f)
                horizontalLineToRelative(dx = 12.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.0f, dy1 = -4.0f)
                verticalLineTo(y = 6.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.0f, dy1 = -4.0f)
                moveTo(x = 9.99f, y = 7.32f)
                curveToRelative(dx1 = 0.56f, dy1 = 0.0f, dx2 = 1.01f, dy2 = 0.45f, dx3 = 1.01f, dy3 = 1.0f)
                reflectiveCurveToRelative(dx1 = -0.45f, dy1 = 1.0f, dx2 = -1.0f, dy2 = 1.0f)
                reflectiveCurveToRelative(dx1 = -1.0f, dy1 = -0.45f, dx2 = -1.0f, dy2 = -1.0f)
                reflectiveCurveToRelative(dx1 = 0.44f, dy1 = -1.0f, dx2 = 0.99f, dy2 = -1.0f)
                moveToRelative(dx = -3.15f, dy = 0.0f)
                curveToRelative(dx1 = 0.56f, dy1 = 0.0f, dx2 = 1.01f, dy2 = 0.45f, dx3 = 1.01f, dy3 = 1.0f)
                reflectiveCurveToRelative(dx1 = -0.45f, dy1 = 1.0f, dx2 = -1.0f, dy2 = 1.0f)
                reflectiveCurveToRelative(dx1 = -1.0f, dy1 = -0.45f, dx2 = -1.0f, dy2 = -1.0f)
                reflectiveCurveToRelative(dx1 = 0.43f, dy1 = -1.0f, dx2 = 0.99f, dy2 = -1.0f)
                moveToRelative(dx = 10.42f, dy = 7.54f)
                horizontalLineTo(x = 6.76f)
                curveTo(x1 = 6.34f, y1 = 14.86f, x2 = 6.0f, y2 = 14.52f, x3 = 6.0f, y3 = 14.11f)
                reflectiveCurveToRelative(dx1 = 0.33f, dy1 = -0.75f, dx2 = 0.74f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 10.53f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.76f, dy2 = 0.75f)
                moveToRelative(dx = 0.0f, dy = -5.79f)
                horizontalLineToRelative(dx = -3.68f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 3.68f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.5f)
            }
        }.build().also { _keyboardOpen = it }
    }

@Suppress("ObjectPropertyName")
private var _keyboardOpen: ImageVector? = null
