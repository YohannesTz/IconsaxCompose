package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Moneys: ImageVector
    get() {
        val current = _moneys
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Moneys",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.17f, y = 6.64f)
                curveToRelative(dx1 = -0.43f, dy1 = -2.17f, dx2 = -2.04f, dy2 = -3.12f, dx3 = -4.28f, dy3 = -3.12f)
                horizontalLineTo(x = 6.11f)
                curveToRelative(dx1 = -2.64f, dy1 = 0.0f, dx2 = -4.4f, dy2 = 1.32f, dx3 = -4.4f, dy3 = 4.4f)
                verticalLineToRelative(dy = 5.15f)
                curveToRelative(dx1 = 0.0f, dy1 = 2.22f, dx2 = 0.91f, dy2 = 3.52f, dx3 = 2.41f, dy3 = 4.08f)
                arcToRelative(a = 5.85f, b = 5.85f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.99f, dy1 = 0.32f)
                horizontalLineToRelative(dx = 8.79f)
                curveToRelative(dx1 = 2.64f, dy1 = 0.0f, dx2 = 4.4f, dy2 = -1.32f, dx3 = 4.4f, dy3 = -4.4f)
                verticalLineTo(y = 7.92f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.13f, dy1 = -1.28f)
                moveTo(x = 5.53f, y = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveTo(x1 = 4.03f, y1 = 12.41f, x2 = 4.03f, y2 = 12.0f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 5.53f, y1 = 8.59f, x2 = 5.53f, y2 = 9.0f)
                close()
                moveToRelative(dx = 4.97f, dy = 1.14f)
                arcToRelative(a = 2.64f, b = 2.64f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -5.27f)
                arcToRelative(a = 2.64f, b = 2.64f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 5.27f)
                moveTo(x = 16.96f, y = 12.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineTo(y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 16.96f, y1 = 8.59f, x2 = 16.96f, y2 = 9.0f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 22.3f, y = 10.92f)
                verticalLineToRelative(dy = 5.15f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.08f, dx2 = -1.76f, dy2 = 4.4f, dx3 = -4.4f, dy3 = 4.4f)
                horizontalLineTo(x = 9.1f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.0f, dy1 = -0.32f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.2f, dy1 = -0.74f)
                curveToRelative(dx1 = -0.19f, dy1 = -0.17f, dx2 = -0.05f, dy2 = -0.44f, dx3 = 0.2f, dy3 = -0.44f)
                horizontalLineToRelative(dx = 8.78f)
                curveToRelative(dx1 = 3.7f, dy1 = 0.0f, dx2 = 5.9f, dy2 = -2.2f, dx3 = 5.9f, dy3 = -5.9f)
                verticalLineTo(y = 7.93f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.24f, dx2 = 0.27f, dy2 = -0.4f, dx3 = 0.44f, dy3 = -0.21f)
                curveToRelative(dx1 = 0.68f, dy1 = 0.72f, dx2 = 1.07f, dy2 = 1.77f, dx3 = 1.07f, dy3 = 3.2f)
            }
        }.build().also { _moneys = it }
    }

@Suppress("ObjectPropertyName")
private var _moneys: ImageVector? = null
