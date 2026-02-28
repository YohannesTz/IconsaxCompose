package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FilterEdit: ImageVector
    get() {
        val current = _filterEdit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.FilterEdit",
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
                moveTo(x = 20.58f, y = 4.02f)
                verticalLineToRelative(dy = 1.95f)
                arcToRelative(a = 6.0f, b = 6.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.7f, dy1 = -1.22f)
                arcToRelative(a = 6.25f, b = 6.25f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.58f, dy1 = 11.93f)
                verticalLineToRelative(dy = 2.39f)
                curveToRelative(dx1 = 0.0f, dy1 = 0.61f, dx2 = -0.4f, dy2 = 1.42f, dx3 = -0.9f, dy3 = 1.72f)
                lineTo(x = 12.0f, y = 21.7f)
                arcToRelative(a = 2.03f, b = 2.03f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -3.09f, dy1 = -1.72f)
                verticalLineToRelative(dy = -5.35f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.8f, dy1 = -2.12f)
                lineTo(x = 4.32f, y = 8.47f)
                arcToRelative(a = 3.4f, b = 3.4f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.9f, dy1 = -2.02f)
                verticalLineTo(y = 4.12f)
                curveTo(x1 = 3.42f, y1 = 2.91f, x2 = 4.32f, y2 = 2.0f, x3 = 5.41f, y3 = 2.0f)
                horizontalLineToRelative(dx = 13.18f)
                arcToRelative(a = 2.0f, b = 2.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 1.99f, dy1 = 2.02f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 17.92f, y = 6.37f)
                arcToRelative(a = 4.0f, b = 4.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.04f, dy1 = -0.12f)
                arcTo(horizontalEllipseRadius = 4.75f, verticalEllipseRadius = 4.75f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, x1 = 21.63f, y1 = 11.0f)
                arcToRelative(a = 4.74f, b = 4.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -3.71f, dy1 = -4.63f)
                moveToRelative(dx = 0.91f, dy = 4.2f)
                lineTo(x = 16.4f, y = 13.0f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.41f, dy1 = 0.2f)
                lineToRelative(dx = -0.93f, dy = 0.13f)
                curveToRelative(dx1 = -0.34f, dy1 = 0.05f, dx2 = -0.57f, dy2 = -0.19f, dx3 = -0.52f, dy3 = -0.52f)
                lineToRelative(dx = 0.13f, dy = -0.93f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.2f, dy1 = -0.41f)
                lineToRelative(dx = 2.08f, dy = -2.08f)
                lineToRelative(dx = 0.35f, dy = -0.35f)
                curveToRelative(dx1 = 0.42f, dy1 = -0.42f, dx2 = 0.91f, dy2 = -0.62f, dx3 = 1.52f, dy3 = 0.0f)
                reflectiveCurveToRelative(dx1 = 0.43f, dy1 = 1.11f, dx2 = 0.01f, dy2 = 1.53f)
            }
        }.build().also { _filterEdit = it }
    }

@Suppress("ObjectPropertyName")
private var _filterEdit: ImageVector? = null
