package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val PlayAdd: ImageVector
    get() {
        val current = _playAdd
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.PlayAdd",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 22.0f, y = 12.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.72f, dy1 = 3.72f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.78f, dy1 = 0.16f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 15.0f, y1 = 19.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.73f, dy1 = 2.27f)
                arcTo(horizontalEllipseRadius = 10.0f, verticalEllipseRadius = 10.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 22.0f)
                arcToRelative(a = 10.0f, b = 10.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 10.0f, dy1 = -10.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 9.38f, y = 12.0f)
                verticalLineToRelative(dy = -1.39f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.72f, dx2 = 1.22f, dy2 = -2.43f, dx3 = 2.7f, dy3 = -1.57f)
                lineToRelative(dx = 1.2f, dy = 0.7f)
                lineToRelative(dx = 1.2f, dy = 0.68f)
                curveToRelative(dx1 = 1.5f, dy1 = 0.86f, dx2 = 1.5f, dy2 = 2.27f, dx3 = 0.0f, dy3 = 3.13f)
                lineToRelative(dx = -1.2f, dy = 0.7f)
                lineToRelative(dx = -1.2f, dy = 0.68f)
                curveToRelative(dx1 = -1.48f, dy1 = 0.86f, dx2 = -2.7f, dy2 = 0.16f, dx3 = -2.7f, dy3 = -1.57f)
                close()
                moveTo(x = 19.0f, y = 15.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.5f, dy1 = 0.88f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 15.0f, y1 = 19.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.58f, dy1 = 2.06f)
                arcTo(horizontalEllipseRadius = 4.0f, verticalEllipseRadius = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 19.0f, y1 = 23.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.63f, dy1 = -1.0f)
                arcTo(horizontalEllipseRadius = 3.92f, verticalEllipseRadius = 3.92f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 23.0f, y1 = 19.0f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -4.0f, dy1 = -4.0f)
                moveToRelative(dx = 1.5f, dy = 4.73f)
                horizontalLineToRelative(dx = -0.75f)
                verticalLineToRelative(dy = 0.78f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.41f, dx2 = -0.34f, dy2 = 0.75f, dx3 = -0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.75f, dy1 = -0.34f, dx2 = -0.75f, dy2 = -0.75f)
                verticalLineToRelative(dy = -0.78f)
                horizontalLineTo(x = 17.5f)
                curveToRelative(dx1 = -0.41f, dy1 = 0.0f, dx2 = -0.75f, dy2 = -0.34f, dx3 = -0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.34f, dy1 = -0.75f, dx2 = 0.75f, dy2 = -0.75f)
                horizontalLineToRelative(dx = 0.75f)
                verticalLineToRelative(dy = -0.71f)
                curveToRelative(dx1 = 0.0f, dy1 = -0.41f, dx2 = 0.34f, dy2 = -0.75f, dx3 = 0.75f, dy3 = -0.75f)
                reflectiveCurveToRelative(dx1 = 0.75f, dy1 = 0.34f, dx2 = 0.75f, dy2 = 0.75f)
                verticalLineToRelative(dy = 0.71f)
                horizontalLineToRelative(dx = 0.75f)
                curveToRelative(dx1 = 0.41f, dy1 = 0.0f, dx2 = 0.75f, dy2 = 0.34f, dx3 = 0.75f, dy3 = 0.75f)
                reflectiveCurveToRelative(dx1 = -0.34f, dy1 = 0.75f, dx2 = -0.75f, dy2 = 0.75f)
            }
        }.build().also { _playAdd = it }
    }

@Suppress("ObjectPropertyName")
private var _playAdd: ImageVector? = null
