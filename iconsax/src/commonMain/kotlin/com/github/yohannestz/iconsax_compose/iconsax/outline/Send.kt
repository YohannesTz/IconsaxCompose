package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Send: ImageVector
    get() {
        val current = _send
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Send",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 5.41f, y = 21.75f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.28f, dy1 = -0.83f)
                curveToRelative(dx1 = -0.88f, dy1 = -0.88f, dx2 = -1.5f, dy2 = -2.75f, dx3 = 0.48f, dy3 = -6.72f)
                lineToRelative(dx = 0.87f, dy = -1.73f)
                arcToRelative(a = 1.4f, b = 1.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -0.94f)
                lineTo(x = 3.61f, y = 9.8f)
                curveTo(x1 = 1.62f, y1 = 5.83f, x2 = 2.25f, y2 = 3.95f, x3 = 3.13f, y3 = 3.08f)
                curveTo(x1 = 4.0f, y1 = 2.2f, x2 = 5.88f, y2 = 1.57f, x3 = 9.84f, y3 = 3.56f)
                lineToRelative(dx = 8.56f, dy = 4.28f)
                curveToRelative(dx1 = 2.13f, dy1 = 1.06f, dx2 = 3.3f, dy2 = 2.54f, dx3 = 3.3f, dy3 = 4.16f)
                reflectiveCurveToRelative(dx1 = -1.17f, dy1 = 3.1f, dx2 = -3.29f, dy2 = 4.16f)
                lineToRelative(dx = -8.56f, dy = 4.28f)
                curveToRelative(dx1 = -1.94f, dy1 = 0.97f, dx2 = -3.38f, dy2 = 1.31f, dx3 = -4.44f, dy3 = 1.31f)
                moveToRelative(dx = 0.0f, dy = -18.0f)
                quadToRelative(dx1 = -0.82f, dy1 = 0.0f, dx2 = -1.22f, dy2 = 0.39f)
                curveTo(x1 = 3.46f, y1 = 4.86f, x2 = 3.75f, y2 = 6.73f, x3 = 4.95f, y3 = 9.12f)
                lineToRelative(dx = 0.87f, dy = 1.74f)
                arcToRelative(a = 2.8f, b = 2.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 2.28f)
                lineToRelative(dx = -0.87f, dy = 1.73f)
                curveToRelative(dx1 = -1.2f, dy1 = 2.4f, dx2 = -1.49f, dy2 = 4.26f, dx3 = -0.76f, dy3 = 4.98f)
                curveToRelative(dx1 = 0.72f, dy1 = 0.73f, dx2 = 2.59f, dy2 = 0.44f, dx3 = 4.99f, dy3 = -0.76f)
                lineToRelative(dx = 8.56f, dy = -4.28f)
                curveToRelative(dx1 = 1.57f, dy1 = -0.78f, dx2 = 2.46f, dy2 = -1.81f, dx3 = 2.46f, dy3 = -2.82f)
                reflectiveCurveToRelative(dx1 = -0.9f, dy1 = -2.04f, dx2 = -2.47f, dy2 = -2.82f)
                lineTo(x = 9.17f, y = 4.9f)
                arcToRelative(a = 9.0f, b = 9.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.76f, dy1 = -1.15f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.84f, y = 12.75f)
                horizontalLineToRelative(dx = -5.4f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 5.4f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _send = it }
    }

@Suppress("ObjectPropertyName")
private var _send: ImageVector? = null
