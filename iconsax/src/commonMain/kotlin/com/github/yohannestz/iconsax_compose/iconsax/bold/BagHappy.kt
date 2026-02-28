package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BagHappy: ImageVector
    get() {
        val current = _bagHappy
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BagHappy",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 19.24f, y = 5.58f)
                horizontalLineToRelative(dx = -0.4f)
                lineTo(x = 15.46f, y = 2.2f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.99f, dy1 = 0.0f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 0.99f)
                lineToRelative(dx = 2.39f, dy = 2.39f)
                horizontalLineTo(x = 7.14f)
                lineToRelative(dx = 2.39f, dy = -2.4f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -0.98f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.99f, dy1 = 0.0f)
                lineTo(x = 5.17f, y = 5.58f)
                horizontalLineToRelative(dx = -0.4f)
                curveToRelative(dx1 = -0.9f, dy1 = 0.0f, dx2 = -2.77f, dy2 = 0.0f, dx3 = -2.77f, dy3 = 2.56f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.97f, dx2 = 0.2f, dy2 = 1.6f, dx3 = 0.62f, dy3 = 2.03f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.84f, dy1 = 0.45f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.9f, dy1 = 0.08f)
                horizontalLineToRelative(dx = 15.28f)
                quadToRelative(dx1 = 0.46f, dy1 = 0.0f, dx2 = 0.88f, dy2 = -0.08f)
                curveToRelative(dx1 = 0.84f, dy1 = -0.2f, dx2 = 1.48f, dy2 = -0.8f, dx3 = 1.48f, dy3 = -2.48f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.56f, dx2 = -1.87f, dy2 = -2.56f, dx3 = -2.76f, dy3 = -2.56f)
                moveTo(x = 19.05f, y = 12.0f)
                horizontalLineTo(x = 4.87f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.99f, dy1 = 1.16f)
                lineToRelative(dx = 0.84f, dy = 5.14f)
                curveTo(x1 = 5.0f, y1 = 20.02f, x2 = 5.75f, y2 = 22.0f, x3 = 9.08f, y3 = 22.0f)
                horizontalLineToRelative(dx = 5.61f)
                curveToRelative(dx1 = 3.37f, dy1 = 0.0f, dx2 = 3.97f, dy2 = -1.69f, dx3 = 4.33f, dy3 = -3.58f)
                lineToRelative(dx = 1.01f, dy = -5.23f)
                arcTo(horizontalEllipseRadius = 1.0f, verticalEllipseRadius = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 19.05f, y1 = 12.0f)
                moveTo(x = 12.0f, y = 19.5f)
                arcToRelative(a = 4.26f, b = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.25f, dy1 = -4.25f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                arcToRelative(a = 2.75f, b = 2.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 5.5f, dy1 = 0.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                arcTo(horizontalEllipseRadius = 4.26f, verticalEllipseRadius = 4.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 19.5f)
            }
        }.build().also { _bagHappy = it }
    }

@Suppress("ObjectPropertyName")
private var _bagHappy: ImageVector? = null
