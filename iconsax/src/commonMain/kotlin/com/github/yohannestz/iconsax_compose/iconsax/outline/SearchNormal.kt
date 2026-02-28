package com.github.yohannestz.iconsax_compose.iconsax.outline

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SearchNormal: ImageVector
    get() {
        val current = _searchNormal
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.SearchNormal",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 11.0f, y = 20.75f)
                arcToRelative(a = 9.76f, b = 9.76f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = true, dx1 = 0.01f, dy1 = -19.51f)
                arcTo(horizontalEllipseRadius = 9.76f, verticalEllipseRadius = 9.76f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 11.0f, y1 = 20.75f)
                moveToRelative(dx = 0.0f, dy = -18.0f)
                arcToRelative(a = 8.26f, b = 8.26f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.02f, dy1 = 16.52f)
                arcTo(horizontalEllipseRadius = 8.26f, verticalEllipseRadius = 8.26f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 11.0f, y1 = 2.75f)
                moveToRelative(dx = 9.16f, dy = 20.04f)
                lineToRelative(dx = -0.23f, dy = -0.02f)
                curveToRelative(dx1 = -0.47f, dy1 = -0.06f, dx2 = -1.32f, dy2 = -0.38f, dx3 = -1.8f, dy3 = -1.81f)
                arcToRelative(a = 2.3f, b = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.25f, dy1 = -2.07f)
                arcTo(horizontalEllipseRadius = 2.3f, verticalEllipseRadius = 2.3f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, x1 = 20.27f, y1 = 18.0f)
                curveToRelative(dx1 = 1.02f, dy1 = 0.0f, dx2 = 1.82f, dy2 = 0.39f, dx3 = 2.18f, dy3 = 1.08f)
                reflectiveCurveToRelative(dx1 = 0.26f, dy1 = 1.57f, dx2 = -0.31f, dy2 = 2.42f)
                curveToRelative(dx1 = -0.71f, dy1 = 1.07f, dx2 = -1.48f, dy2 = 1.29f, dx3 = -1.98f, dy3 = 1.29f)
                moveToRelative(dx = -0.6f, dy = -2.3f)
                curveToRelative(dx1 = 0.17f, dy1 = 0.52f, dx2 = 0.41f, dy2 = 0.78f, dx3 = 0.57f, dy3 = 0.8f)
                reflectiveCurveToRelative(dx1 = 0.46f, dy1 = -0.17f, dx2 = 0.77f, dy2 = -0.62f)
                curveToRelative(dx1 = 0.29f, dy1 = -0.43f, dx2 = 0.31f, dy2 = -0.74f, dx3 = 0.24f, dy3 = -0.88f)
                reflectiveCurveToRelative(dx1 = -0.35f, dy1 = -0.29f, dx2 = -0.87f, dy2 = -0.29f)
                quadToRelative(dx1 = -0.47f, dy1 = 0.0f, dx2 = -0.67f, dy2 = 0.27f)
                quadToRelative(dx1 = -0.19f, dy1 = 0.27f, dx2 = -0.04f, dy2 = 0.72f)
            }
        }.build().also { _searchNormal = it }
    }

@Suppress("ObjectPropertyName")
private var _searchNormal: ImageVector? = null
