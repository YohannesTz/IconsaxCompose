package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Coin: ImageVector
    get() {
        val current = _coin
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Coin",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.84f, y = 13.54f)
                horizontalLineToRelative(dx = -1.5f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -2.08f, dy1 = -2.15f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.36f, dx2 = 0.26f, dy2 = 0.65f, dx3 = 0.58f, dy3 = 0.65f)
                horizontalLineToRelative(dx = 1.5f)
                curveToRelative(dx1 = 0.23f, dy1 = 0.0f, dx2 = 0.41f, dy2 = -0.21f, dx3 = 0.41f, dy3 = -0.47f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.35f, dx2 = -0.06f, dy2 = -0.37f, dx3 = -0.29f, dy3 = -0.45f)
                lineToRelative(dx = -2.41f, dy = -0.84f)
                quadToRelative(dx1 = -1.3f, dy1 = -0.44f, dx2 = -1.3f, dy2 = -1.86f)
                arcToRelative(a = 1.95f, b = 1.95f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.91f, dy1 = -1.97f)
                horizontalLineToRelative(dx = 1.5f)
                arcToRelative(a = 2.1f, b = 2.1f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 2.08f, dy1 = 2.15f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.36f, dx2 = -0.26f, dy2 = -0.65f, dx3 = -0.58f, dy3 = -0.65f)
                horizontalLineToRelative(dx = -1.5f)
                curveToRelative(dx1 = -0.23f, dy1 = 0.0f, dx2 = -0.41f, dy2 = 0.21f, dx3 = -0.41f, dy3 = 0.47f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.35f, dx2 = 0.06f, dy2 = 0.37f, dx3 = 0.29f, dy3 = 0.45f)
                lineToRelative(dx = 2.41f, dy = 0.84f)
                quadToRelative(dx1 = 1.3f, dy1 = 0.46f, dx2 = 1.29f, dy2 = 1.86f)
                arcToRelative(a = 1.93f, b = 1.93f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.9f, dy1 = 1.97f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 10.0f, y = 14.34f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineToRelative(dy = -0.74f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.4f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 0.74f)
                arcTo(horizontalEllipseRadius = 0.75f, verticalEllipseRadius = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 10.0f, y1 = 14.34f)
                moveToRelative(dx = 0.0f, dy = -6.4f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                verticalLineTo(y = 6.41f)
                curveTo(x1 = 9.25f, y1 = 6.0f, x2 = 9.59f, y2 = 5.66f, x3 = 10.0f, y3 = 5.66f)
                reflectiveCurveTo(x1 = 10.75f, y1 = 6.0f, x2 = 10.75f, y2 = 6.41f)
                verticalLineToRelative(dy = 0.78f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 10.0f, y1 = 7.94f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.99f, y = 18.72f)
                arcToRelative(a = 8.75f, b = 8.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -17.48f)
                arcToRelative(a = 8.75f, b = 8.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 17.48f)
                moveToRelative(dx = 0.0f, dy = -15.97f)
                arcToRelative(a = 7.24f, b = 7.24f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 14.46f)
                arcToRelative(a = 7.24f, b = 7.24f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -14.46f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.02f, y = 22.72f)
                arcToRelative(a = 5.7f, b = 5.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -4.66f, dy1 = -2.42f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 1.23f, dy1 = -0.87f)
                arcTo(horizontalEllipseRadius = 4.2f, verticalEllipseRadius = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 21.22f, y1 = 17.0f)
                arcToRelative(a = 4.2f, b = 4.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.76f, dy1 = -3.42f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.88f, dy1 = -1.22f)
                arcTo(horizontalEllipseRadius = 5.7f, verticalEllipseRadius = 5.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 22.72f, y1 = 17.0f)
                arcToRelative(a = 5.7f, b = 5.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -5.7f, dy1 = 5.7f)
            }
        }.build().also { _coin = it }
    }

@Suppress("ObjectPropertyName")
private var _coin: ImageVector? = null
