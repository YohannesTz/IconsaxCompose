package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DiscountShape: ImageVector
    get() {
        val current = _discountShape
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DiscountShape",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 21.53f, y = 10.87f)
                lineTo(x = 20.0f, y = 9.35f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.47f, dy1 = -1.13f)
                verticalLineTo(y = 6.06f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.6f, dy1 = -1.6f)
                horizontalLineToRelative(dx = -2.15f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.13f, dy1 = -0.47f)
                lineToRelative(dx = -1.52f, dy = -1.52f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.26f, dy1 = 0.0f)
                lineTo(x = 9.34f, y = 3.99f)
                arcTo(horizontalEllipseRadius = 1.8f, verticalEllipseRadius = 1.8f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 8.2f, y1 = 4.46f)
                horizontalLineTo(x = 6.06f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.6f, dy1 = 1.6f)
                verticalLineTo(y = 8.2f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.47f, dy1 = 1.13f)
                lineToRelative(dx = -1.52f, dy = 1.52f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 2.26f)
                lineToRelative(dx = 1.52f, dy = 1.52f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.47f, dy1 = 1.13f)
                verticalLineToRelative(dy = 2.15f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.6f, dy1 = 1.6f)
                horizontalLineTo(x = 8.2f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.13f, dy1 = 0.47f)
                lineToRelative(dx = 1.52f, dy = 1.52f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.26f, dy1 = 0.0f)
                lineToRelative(dx = 1.52f, dy = -1.52f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.13f, dy1 = -0.47f)
                horizontalLineToRelative(dx = 2.15f)
                arcToRelative(a = 1.6f, b = 1.6f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 1.6f, dy1 = -1.6f)
                verticalLineToRelative(dy = -2.15f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.47f, dy1 = -1.13f)
                lineToRelative(dx = 1.52f, dy = -1.52f)
                arcToRelative(a = 1.56f, b = 1.56f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.02f, dy1 = -2.25f)
                moveTo(x = 8.0f, y = 9.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.55f, dx2 = 0.45f, dy2 = -1.0f, dx3 = 1.0f, dy3 = -1.0f)
                reflectiveCurveToRelative(dx1 = 1.0f, dy1 = 0.45f, dx2 = 1.0f, dy2 = 1.0f)
                reflectiveCurveToRelative(dx1 = -0.44f, dy1 = 1.0f, dx2 = -1.0f, dy2 = 1.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.0f, dy1 = -1.0f)
                moveToRelative(dx = 1.53f, dy = 6.53f)
                quadTo(x1 = 9.3f, y1 = 15.75f, x2 = 9.0f, y2 = 15.75f)
                curveToRelative(dx1 = -0.3f, dy1 = 0.0f, dx2 = -0.38f, dy2 = -0.07f, dx3 = -0.53f, dy3 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = -1.06f)
                lineToRelative(dx = 6.0f, dy = -6.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.0f, dy1 = 1.06f)
                close()
                moveTo(x = 15.0f, y = 16.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -1.01f, dy1 = -1.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.55f, dx2 = 0.45f, dy2 = -1.0f, dx3 = 1.0f, dy3 = -1.0f)
                reflectiveCurveToRelative(dx1 = 1.0f, dy1 = 0.45f, dx2 = 1.0f, dy2 = 1.0f)
                reflectiveCurveToRelative(dx1 = -0.44f, dy1 = 1.0f, dx2 = -1.0f, dy2 = 1.0f)
            }
        }.build().also { _discountShape = it }
    }

@Suppress("ObjectPropertyName")
private var _discountShape: ImageVector? = null
