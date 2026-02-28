package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val RulerPen: ImageVector
    get() {
        val current = _rulerPen
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.RulerPen",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 18.47f, y = 22.75f)
                horizontalLineToRelative(dx = -4.0f)
                curveToRelative(dx1 = -2.42f, dy1 = 0.0f, dx2 = -3.75f, dy2 = -1.33f, dx3 = -3.75f, dy3 = -3.75f)
                verticalLineTo(y = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.42f, dx2 = 1.33f, dy2 = -3.75f, dx3 = 3.75f, dy3 = -3.75f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 2.42f, dy1 = 0.0f, dx2 = 3.75f, dy2 = 1.33f, dx3 = 3.75f, dy3 = 3.75f)
                verticalLineToRelative(dy = 14.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.42f, dx2 = -1.34f, dy2 = 3.75f, dx3 = -3.75f, dy3 = 3.75f)
                moveToRelative(dx = -4.0f, dy = -20.0f)
                curveToRelative(dx1 = -1.58f, dy1 = 0.0f, dx2 = -2.25f, dy2 = 0.67f, dx3 = -2.25f, dy3 = 2.25f)
                verticalLineToRelative(dy = 14.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 1.58f, dx2 = 0.67f, dy2 = 2.25f, dx3 = 2.25f, dy3 = 2.25f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 1.58f, dy1 = 0.0f, dx2 = 2.25f, dy2 = -0.67f, dx3 = 2.25f, dy3 = -2.25f)
                verticalLineTo(y = 5.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.58f, dx2 = -0.67f, dy2 = -2.25f, dx3 = -2.25f, dy3 = -2.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.47f, y = 6.75f)
                horizontalLineToRelative(dx = -5.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 5.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = -1.0f, dy = 12.0f)
                horizontalLineToRelative(dx = -4.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveToRelative(dx = 1.0f, dy = -4.0f)
                quadToRelative(dx1 = -0.02f, dy1 = 0.0f, dx2 = 0.0f, dy2 = 0.0f)
                lineToRelative(dx = -5.01f, dy = -0.05f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.74f, dy1 = -0.76f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.75f, dy1 = -0.74f)
                horizontalLineToRelative(dx = 0.01f)
                lineToRelative(dx = 5.0f, dy = 0.05f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.74f, dy1 = 0.76f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = 0.74f)
                moveToRelative(dx = -2.0f, dy = -4.0f)
                horizontalLineToRelative(dx = -3.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 3.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
                moveTo(x = 5.49f, y = 22.72f)
                curveToRelative(dx1 = -0.91f, dy1 = 0.0f, dx2 = -1.77f, dy2 = -0.56f, dx3 = -2.36f, dy3 = -1.54f)
                lineToRelative(dx = -0.82f, dy = -1.36f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -1.9f)
                verticalLineTo(y = 4.95f)
                arcToRelative(a = 3.7f, b = 3.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 7.4f, dy1 = 0.0f)
                verticalLineToRelative(dy = 12.96f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.58f, dx2 = -0.23f, dy2 = 1.4f, dx3 = -0.53f, dy3 = 1.9f)
                lineToRelative(dx = -0.82f, dy = 1.36f)
                curveToRelative(dx1 = -0.57f, dy1 = 0.99f, dx2 = -1.43f, dy2 = 1.55f, dx3 = -2.34f, dy3 = 1.55f)
                moveToRelative(dx = 0.0f, dy = -19.97f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.2f, dy1 = 2.2f)
                verticalLineToRelative(dy = 12.96f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.31f, dy1 = 1.13f)
                lineToRelative(dx = 0.82f, dy = 1.36f)
                curveToRelative(dx1 = 0.31f, dy1 = 0.52f, dx2 = 0.7f, dy2 = 0.81f, dx3 = 1.07f, dy3 = 0.81f)
                reflectiveCurveToRelative(dx1 = 0.76f, dy1 = -0.3f, dx2 = 1.07f, dy2 = -0.81f)
                lineToRelative(dx = 0.82f, dy = -1.36f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.31f, dy1 = -1.13f)
                verticalLineTo(y = 4.95f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.2f, dy1 = -2.2f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 8.44f, y = 7.75f)
                horizontalLineTo(x = 2.53f)
                curveTo(x1 = 2.12f, y1 = 7.75f, x2 = 1.78f, y2 = 7.41f, x3 = 1.78f, y3 = 7.0f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 5.91f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 8.85f, y1 = 7.75f, x2 = 8.44f, y2 = 7.75f)
            }
        }.build().also { _rulerPen = it }
    }

@Suppress("ObjectPropertyName")
private var _rulerPen: ImageVector? = null
