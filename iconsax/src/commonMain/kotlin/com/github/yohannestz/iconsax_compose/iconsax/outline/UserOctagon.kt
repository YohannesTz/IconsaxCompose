package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserOctagon: ImageVector
    get() {
        val current = _userOctagon
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.UserOctagon",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 22.75f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.95f, dy1 = -0.52f)
                lineTo(x = 4.11f, y = 18.8f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.95f, dy1 = -3.38f)
                verticalLineTo(y = 8.58f)
                arcTo(horizontalEllipseRadius = 3.9f, verticalEllipseRadius = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 4.11f, y1 = 5.2f)
                lineToRelative(dx = 5.94f, dy = -3.43f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 3.9f, dy1 = 0.0f)
                lineToRelative(dx = 5.94f, dy = 3.43f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.95f, dy1 = 3.38f)
                verticalLineToRelative(dy = 6.84f)
                arcToRelative(a = 3.9f, b = 3.9f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.95f, dy1 = 3.38f)
                lineToRelative(dx = -5.94f, dy = 3.43f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.75f)
                moveToRelative(dx = 0.0f, dy = -20.0f)
                arcToRelative(a = 2.5f, b = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.2f, dy1 = 0.32f)
                lineTo(x = 4.86f, y = 6.5f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.2f, dy1 = 2.08f)
                verticalLineToRelative(dy = 6.84f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.2f, dy1 = 2.08f)
                lineToRelative(dx = 5.94f, dy = 3.43f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.4f, dy1 = 0.0f)
                lineToRelative(dx = 5.94f, dy = -3.43f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.2f, dy1 = -2.08f)
                verticalLineTo(y = 8.58f)
                arcToRelative(a = 2.4f, b = 2.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.2f, dy1 = -2.08f)
                lineTo(x = 13.2f, y = 3.07f)
                arcTo(horizontalEllipseRadius = 2.5f, verticalEllipseRadius = 2.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 2.75f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 11.75f)
                arcToRelative(a = 3.08f, b = 3.08f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.0f, dy1 = -6.16f)
                arcToRelative(a = 3.08f, b = 3.08f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 6.16f)
                moveToRelative(dx = 0.0f, dy = -4.66f)
                arcToRelative(a = 1.58f, b = 1.58f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 3.16f)
                arcToRelative(a = 1.58f, b = 1.58f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -3.16f)
                moveToRelative(dx = 4.0f, dy = 10.32f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.75f, dy1 = -0.75f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.38f, dx2 = -1.46f, dy2 = -2.51f, dx3 = -3.25f, dy3 = -2.51f)
                reflectiveCurveToRelative(dx1 = -3.25f, dy1 = 1.13f, dx2 = -3.25f, dy2 = 2.5f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.42f, dx2 = -0.34f, dy2 = 0.76f, dx3 = -0.75f, dy3 = 0.76f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                curveToRelative(dx1 = 0.0f, dy1 = -2.21f, dx2 = 2.13f, dy2 = -4.01f, dx3 = 4.75f, dy3 = -4.01f)
                reflectiveCurveToRelative(dx1 = 4.75f, dy1 = 1.8f, dx2 = 4.75f, dy2 = 4.0f)
                arcTo(horizontalEllipseRadius = 0.76f, verticalEllipseRadius = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 16.0f, y1 = 17.42f)
            }
        }.build().also { _userOctagon = it }
    }

@Suppress("ObjectPropertyName")
private var _userOctagon: ImageVector? = null
