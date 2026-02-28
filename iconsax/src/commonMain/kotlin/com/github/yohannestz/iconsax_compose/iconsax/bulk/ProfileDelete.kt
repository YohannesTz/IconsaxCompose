package com.github.yohannestz.iconsax_compose.iconsax.bulk

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val ProfileDelete: ImageVector
    get() {
        val current = _profileDelete
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.ProfileDelete",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                arcToRelative(a = 4.75f, b = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -0.12f, dy1 = 9.49f)
                horizontalLineToRelative(dx = 0.29f)
                arcToRelative(a = 4.74f, b = 4.74f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 4.58f, dy1 = -4.74f)
                arcTo(horizontalEllipseRadius = 4.75f, verticalEllipseRadius = 4.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 2.0f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
                fillAlpha = 0.4f,
                strokeAlpha = 0.4f,
            ) {
                moveTo(x = 17.08f, y = 14.15f)
                curveToRelative(dx1 = -2.79f, dy1 = -1.86f, dx2 = -7.34f, dy2 = -1.86f, dx3 = -10.15f, dy3 = 0.0f)
                curveToRelative(dx1 = -1.27f, dy1 = 0.85f, dx2 = -1.97f, dy2 = 2.0f, dx3 = -1.97f, dy3 = 3.23f)
                reflectiveCurveToRelative(dx1 = 0.7f, dy1 = 2.37f, dx2 = 1.96f, dy2 = 3.2f)
                arcTo(horizontalEllipseRadius = 9.2f, verticalEllipseRadius = 9.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, x1 = 12.0f, y1 = 22.0f)
                arcToRelative(a = 9.2f, b = 9.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 5.08f, dy1 = -1.41f)
                curveToRelative(dx1 = 1.26f, dy1 = -0.85f, dx2 = 1.96f, dy2 = -2.0f, dx3 = 1.96f, dy3 = -3.23f)
                curveToRelative(dx1 = -0.01f, dy1 = -1.23f, dx2 = -0.7f, dy2 = -2.37f, dx3 = -1.96f, dy3 = -3.21f)
            }
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 13.06f, y = 17.38f)
                lineToRelative(dx = 0.88f, dy = -0.88f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.06f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                lineTo(x = 12.0f, y = 16.32f)
                lineToRelative(dx = -0.88f, dy = -0.88f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -1.06f, dy1 = 0.0f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                lineToRelative(dx = 0.88f, dy = 0.88f)
                lineToRelative(dx = -0.88f, dy = 0.88f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = 1.06f)
                quadToRelative(dx1 = 0.24f, dy1 = 0.22f, dx2 = 0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.0f, dx2 = 0.38f, dy2 = -0.07f, dx3 = 0.53f, dy3 = -0.22f)
                lineTo(x = 12.0f, y = 18.44f)
                lineToRelative(dx = 0.88f, dy = 0.88f)
                quadToRelative(dx1 = 0.24f, dy1 = 0.22f, dx2 = 0.53f, dy2 = 0.22f)
                curveToRelative(dx1 = 0.3f, dy1 = 0.0f, dx2 = 0.38f, dy2 = -0.07f, dx3 = 0.53f, dy3 = -0.22f)
                arcToRelative(a = 0.75f, b = 0.75f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -1.06f)
                close()
            }
        }.build().also { _profileDelete = it }
    }

@Suppress("ObjectPropertyName")
private var _profileDelete: ImageVector? = null
