package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val MessageTick: ImageVector
    get() {
        val current = _messageTick
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.MessageTick",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 16.0f, y = 22.32f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.96f, dy1 = -0.29f)
                lineToRelative(dx = -4.26f, dy = -2.84f)
                horizontalLineToRelative(dx = -1.9f)
                arcTo(horizontalEllipseRadius = 0.8f, verticalEllipseRadius = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.3f, y1 = 18.9f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.13f, dy1 = -0.65f)
                arcToRelative(a = 3.0f, b = 3.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.09f, dy1 = -0.74f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.8f, dx2 = -0.3f, dy2 = -1.57f, dx3 = -0.84f, dy3 = -2.17f)
                arcTo(horizontalEllipseRadius = 3.2f, verticalEllipseRadius = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 5.0f, y1 = 14.26f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.33f, dy1 = 0.98f)
                curveToRelative(dx1 = -0.2f, dy1 = 0.2f, dx2 = -0.48f, dy2 = 0.27f, dx3 = -0.74f, dy3 = 0.2f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.56f)
                arcToRelative(a = 7.0f, b = 7.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.15f, dy1 = -1.44f)
                verticalLineToRelative(dy = -6.0f)
                curveTo(x1 = 1.26f, y1 = 4.0f, x2 = 3.56f, y2 = 1.7f, x3 = 7.0f, y3 = 1.7f)
                horizontalLineToRelative(dx = 10.0f)
                curveToRelative(dx1 = 3.44f, dy1 = 0.0f, dx2 = 5.75f, dy2 = 2.31f, dx3 = 5.75f, dy3 = 5.75f)
                verticalLineToRelative(dy = 6.0f)
                arcToRelative(a = 5.7f, b = 5.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.6f, dy1 = 4.16f)
                arcToRelative(a = 5.5f, b = 5.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.4f, dy1 = 1.55f)
                verticalLineToRelative(dy = 1.42f)
                arcToRelative(a = 1.8f, b = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.93f, dy1 = 1.55f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.83f, dy1 = 0.2f)
                moveToRelative(dx = -6.25f, dy = -4.64f)
                horizontalLineTo(x = 11.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.42f, dy1 = 0.13f)
                lineToRelative(dx = 4.45f, dy = 2.97f)
                arcToRelative(a = 0.2f, b = 0.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.25f, dy1 = 0.01f)
                curveToRelative(dx1 = 0.05f, dy1 = -0.03f, dx2 = 0.14f, dy2 = -0.09f, dx3 = 0.14f, dy3 = -0.23f)
                verticalLineToRelative(dy = -2.13f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 17.0f, y1 = 17.68f)
                curveToRelative(dx1 = 1.27f, dy1 = 0.0f, dx2 = 2.34f, dy2 = -0.4f, dx3 = 3.09f, dy3 = -1.15f)
                arcToRelative(a = 4.3f, b = 4.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.16f, dy1 = -3.1f)
                verticalLineToRelative(dy = -6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.58f, dx2 = -1.67f, dy2 = -4.25f, dx3 = -4.25f, dy3 = -4.25f)
                horizontalLineTo(x = 7.0f)
                curveToRelative(dx1 = -2.58f, dy1 = 0.0f, dx2 = -4.25f, dy2 = 1.67f, dx3 = -4.25f, dy3 = 4.25f)
                verticalLineToRelative(dy = 5.88f)
                arcTo(horizontalEllipseRadius = 5.0f, verticalEllipseRadius = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.0f, y1 = 12.75f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.53f, dy1 = 1.58f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.22f, dy1 = 3.17f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 5.0f, y = 22.25f)
                arcToRelative(a = 4.7f, b = 4.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.06f, dy1 = -2.31f)
                arcTo(horizontalEllipseRadius = 4.71f, verticalEllipseRadius = 4.71f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 5.0f, y1 = 12.75f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 9.5f)
                moveToRelative(dx = 0.0f, dy = -8.0f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.03f, dy1 = 0.72f)
                arcToRelative(a = 3.2f, b = 3.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.75f, dy1 = 4.2f)
                arcTo(horizontalEllipseRadius = 3.24f, verticalEllipseRadius = 3.24f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, x1 = 5.0f, y1 = 14.25f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 4.43f, y = 19.24f)
                arcToRelative(a = 0.7f, b = 0.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.53f, dy1 = -0.22f)
                lineToRelative(dx = -1.0f, dy = -0.99f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.07f, dy1 = 0.0f)
                lineToRelative(dx = 0.48f, dy = 0.48f)
                lineToRelative(dx = 1.6f, dy = -1.48f)
                curveToRelative(dx1 = 0.3f, dy1 = -0.28f, dx2 = 0.78f, dy2 = -0.26f, dx3 = 1.06f, dy3 = 0.04f)
                reflectiveCurveToRelative(dx1 = 0.26f, dy1 = 0.78f, dx2 = -0.04f, dy2 = 1.06f)
                lineToRelative(dx = -2.13f, dy = 1.97f)
                arcToRelative(a = 0.8f, b = 0.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.51f, dy1 = 0.2f)
                moveToRelative(dx = 11.07f, dy = -7.99f)
                horizontalLineToRelative(dx = -7.0f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveTo(x1 = 8.09f, y1 = 9.75f, x2 = 8.5f, y2 = 9.75f)
                horizontalLineToRelative(dx = 7.0f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _messageTick = it }
    }

@Suppress("ObjectPropertyName")
private var _messageTick: ImageVector? = null
