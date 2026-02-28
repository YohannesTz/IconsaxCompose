package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SendTwo: ImageVector
    get() {
        val current = _sendTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SendTwo",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.22f, y = 21.63f)
                curveToRelative(dx1 = -1.18f, dy1 = 0.0f, dx2 = -2.85f, dy2 = -0.83f, dx3 = -4.17f, dy3 = -4.8f)
                lineToRelative(dx = -0.72f, dy = -2.16f)
                lineToRelative(dx = -2.16f, dy = -0.72f)
                curveToRelative(dx1 = -3.96f, dy1 = -1.32f, dx2 = -4.79f, dy2 = -2.99f, dx3 = -4.79f, dy3 = -4.17f)
                reflectiveCurveTo(x1 = 3.21f, y1 = 6.93f, x2 = 7.17f, y2 = 5.6f)
                lineToRelative(dx = 8.49f, dy = -2.83f)
                curveToRelative(dx1 = 2.12f, dy1 = -0.71f, dx2 = 3.89f, dy2 = -0.5f, dx3 = 4.98f, dy3 = 0.58f)
                reflectiveCurveToRelative(dx1 = 1.3f, dy1 = 2.86f, dx2 = 0.59f, dy2 = 4.98f)
                lineToRelative(dx = -2.83f, dy = 8.49f)
                curveToRelative(dx1 = -1.33f, dy1 = 3.98f, dx2 = -3.0f, dy2 = 4.81f, dx3 = -4.18f, dy3 = 4.81f)
                moveTo(x = 7.64f, y = 7.03f)
                curveTo(x1 = 4.86f, y1 = 7.96f, x2 = 3.87f, y2 = 9.06f, x3 = 3.87f, y3 = 9.78f)
                reflectiveCurveToRelative(dx1 = 0.99f, dy1 = 1.82f, dx2 = 3.77f, dy2 = 2.74f)
                lineToRelative(dx = 2.52f, dy = 0.84f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.47f, dy1 = 0.47f)
                lineToRelative(dx = 0.84f, dy = 2.52f)
                curveToRelative(dx1 = 0.92f, dy1 = 2.78f, dx2 = 2.03f, dy2 = 3.77f, dx3 = 2.75f, dy3 = 3.77f)
                reflectiveCurveToRelative(dx1 = 1.82f, dy1 = -0.99f, dx2 = 2.75f, dy2 = -3.77f)
                lineToRelative(dx = 2.83f, dy = -8.49f)
                curveToRelative(dx1 = 0.51f, dy1 = -1.54f, dx2 = 0.42f, dy2 = -2.8f, dx3 = -0.23f, dy3 = -3.45f)
                reflectiveCurveToRelative(dx1 = -1.91f, dy1 = -0.73f, dx2 = -3.44f, dy2 = -0.22f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.11f, y = 14.4f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = 3.58f, dy = -3.59f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = -3.58f, dy = 3.59f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = 0.22f)
            }
        }.build().also { _sendTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _sendTwo: ImageVector? = null
