package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val Eye: ImageVector
    get() {
        val current = _eye
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.Eye",
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
                moveTo(x = 21.25f, y = 9.15f)
                curveTo(x1 = 18.94f, y1 = 5.52f, x2 = 15.56f, y2 = 3.43f, x3 = 12.0f, y3 = 3.43f)
                arcToRelative(a = 9.7f, b = 9.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -5.09f, dy1 = 1.49f)
                curveToRelative(dx1 = -1.58f, dy1 = 0.98f, dx2 = -3.0f, dy2 = 2.41f, dx3 = -4.16f, dy3 = 4.23f)
                curveToRelative(dx1 = -1.0f, dy1 = 1.57f, dx2 = -1.0f, dy2 = 4.12f, dx3 = 0.0f, dy3 = 5.69f)
                curveToRelative(dx1 = 2.31f, dy1 = 3.64f, dx2 = 5.69f, dy2 = 5.72f, dx3 = 9.25f, dy3 = 5.72f)
                arcToRelative(a = 9.7f, b = 9.7f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.09f, dy1 = -1.49f)
                curveToRelative(dx1 = 1.58f, dy1 = -0.98f, dx2 = 3.0f, dy2 = -2.41f, dx3 = 4.16f, dy3 = -4.23f)
                curveToRelative(dx1 = 1.0f, dy1 = -1.56f, dx2 = 1.0f, dy2 = -4.12f, dx3 = 0.0f, dy3 = -5.69f)
                moveTo(x = 12.0f, y = 16.04f)
                arcToRelative(a = 4.04f, b = 4.04f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = -0.01f, dy1 = -8.07f)
                arcTo(horizontalEllipseRadius = 4.04f, verticalEllipseRadius = 4.04f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 12.0f, y1 = 16.04f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 9.14f)
                arcToRelative(a = 2.86f, b = 2.86f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 5.71f)
                curveToRelative(dx1 = 1.57f, dy1 = 0.0f, dx2 = 2.86f, dy2 = -1.28f, dx3 = 2.86f, dy3 = -2.85f)
                reflectiveCurveTo(x1 = 13.56f, y1 = 9.14f, x2 = 12.0f, y2 = 9.14f)
            }
        }.build().also { _eye = it }
    }

@Suppress("ObjectPropertyName")
private var _eye: ImageVector? = null
