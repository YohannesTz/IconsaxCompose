package com.github.yohannestz.iconsax_compose.iconsax.outline

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
            ) {
                moveTo(x = 16.5f, y = 20.75f)
                horizontalLineToRelative(dx = -9.0f)
                curveToRelative(dx1 = -0.75f, dy1 = 0.0f, dx2 = -1.3f, dy2 = -0.03f, dx3 = -1.77f, dy3 = -0.1f)
                curveTo(x1 = 2.41f, y1 = 20.29f, x2 = 1.75f, y2 = 18.3f, x3 = 1.75f, y3 = 15.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.3f, dx2 = 0.66f, dy2 = -5.29f, dx3 = 4.01f, dy3 = -5.66f)
                arcTo(horizontalEllipseRadius = 13.0f, verticalEllipseRadius = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 7.5f, y1 = 3.25f)
                horizontalLineToRelative(dx = 9.0f)
                curveToRelative(dx1 = 0.75f, dy1 = 0.0f, dx2 = 1.3f, dy2 = 0.03f, dx3 = 1.77f, dy3 = 0.1f)
                curveTo(x1 = 21.59f, y1 = 3.71f, x2 = 22.25f, y2 = 5.7f, x3 = 22.25f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.3f, dx2 = -0.66f, dy2 = 5.29f, dx3 = -4.01f, dy3 = 5.66f)
                arcToRelative(a = 13.0f, b = 13.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.74f, dy1 = 0.09f)
                moveToRelative(dx = -9.0f, dy = -16.0f)
                curveToRelative(dx1 = -0.68f, dy1 = 0.0f, dx2 = -1.16f, dy2 = 0.03f, dx3 = -1.55f, dy3 = 0.08f)
                curveTo(x1 = 3.92f, y1 = 5.06f, x2 = 3.25f, y2 = 5.69f, x3 = 3.25f, y3 = 9.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.31f, dx2 = 0.67f, dy2 = 3.94f, dx3 = 2.67f, dy3 = 4.17f)
                arcToRelative(a = 11.0f, b = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.58f, dy1 = 0.08f)
                horizontalLineToRelative(dx = 9.0f)
                curveToRelative(dx1 = 0.68f, dy1 = 0.0f, dx2 = 1.16f, dy2 = -0.03f, dx3 = 1.55f, dy3 = -0.08f)
                curveToRelative(dx1 = 2.03f, dy1 = -0.22f, dx2 = 2.7f, dy2 = -0.86f, dx3 = 2.7f, dy3 = -4.17f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -3.31f, dx2 = -0.67f, dy2 = -3.94f, dx3 = -2.67f, dy3 = -4.17f)
                arcToRelative(a = 11.0f, b = 11.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.58f, dy1 = -0.08f)
                close()
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
