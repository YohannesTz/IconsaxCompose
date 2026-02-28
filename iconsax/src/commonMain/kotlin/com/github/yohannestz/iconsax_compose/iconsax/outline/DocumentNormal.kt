package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentNormal: ImageVector
    get() {
        val current = _documentNormal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.DocumentNormal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 14.0f, y = 6.75f)
                horizontalLineToRelative(dx = -4.0f)
                curveToRelative(dx1 = -0.96f, dy1 = 0.0f, dx2 = -2.75f, dy2 = 0.0f, dx3 = -2.75f, dy3 = -2.75f)
                reflectiveCurveTo(x1 = 9.04f, y1 = 1.25f, x2 = 10.0f, y2 = 1.25f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 0.96f, dy1 = 0.0f, dx2 = 2.75f, dy2 = 0.0f, dx3 = 2.75f, dy3 = 2.75f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.96f, dx2 = 0.0f, dy2 = 2.75f, dx3 = -2.75f, dy3 = 2.75f)
                moveToRelative(dx = -4.0f, dy = -4.0f)
                curveToRelative(dx1 = -0.99f, dy1 = 0.0f, dx2 = -1.25f, dy2 = 0.0f, dx3 = -1.25f, dy3 = 1.25f)
                reflectiveCurveTo(x1 = 9.01f, y1 = 5.25f, x2 = 10.0f, y2 = 5.25f)
                horizontalLineToRelative(dx = 4.0f)
                curveToRelative(dx1 = 1.25f, dy1 = 0.0f, dx2 = 1.25f, dy2 = -0.26f, dx3 = 1.25f, dy3 = -1.25f)
                curveToRelative(dx1 = 0.0f, dy1 = -1.25f, dx2 = -0.26f, dy2 = -1.25f, dx3 = -1.25f, dy3 = -1.25f)
                close()
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 15.0f, y = 22.75f)
                horizontalLineTo(x = 9.0f)
                curveToRelative(dx1 = -5.62f, dy1 = 0.0f, dx2 = -6.75f, dy2 = -2.58f, dx3 = -6.75f, dy3 = -6.75f)
                verticalLineToRelative(dy = -6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.56f, dx2 = 1.65f, dy2 = -6.51f, dx3 = 5.71f, dy3 = -6.72f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.79f, dy1 = 0.71f)
                arcToRelative(a = 0.74f, b = 0.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.71f, dy1 = 0.78f)
                curveTo(x1 = 5.2f, y1 = 4.93f, x2 = 3.75f, y2 = 5.78f, x3 = 3.75f, y3 = 10.0f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 3.7f, dx2 = 0.73f, dy2 = 5.25f, dx3 = 5.25f, dy3 = 5.25f)
                horizontalLineToRelative(dx = 6.0f)
                curveToRelative(dx1 = 4.52f, dy1 = 0.0f, dx2 = 5.25f, dy2 = -1.55f, dx3 = 5.25f, dy3 = -5.25f)
                verticalLineToRelative(dy = -6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.22f, dx2 = -1.45f, dy2 = -5.07f, dx3 = -4.29f, dy3 = -5.23f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.71f, dy1 = -0.79f)
                arcToRelative(a = 0.76f, b = 0.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.79f, dy1 = -0.71f)
                curveToRelative(dx1 = 4.06f, dy1 = 0.22f, dx2 = 5.71f, dy2 = 2.17f, dx3 = 5.71f, dy3 = 6.72f)
                verticalLineToRelative(dy = 6.0f)
                curveToRelative(dx1 = 0.0f, dy1 = 4.18f, dx2 = -1.13f, dy2 = 6.76f, dx3 = -6.75f, dy3 = 6.76f)
            }
        }.build().also { _documentNormal = it }
    }

@Suppress("ObjectPropertyName")
private var _documentNormal: ImageVector? = null
