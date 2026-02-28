package com.github.yohannestz.iconsax_compose.iconsax.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val UserEdit: ImageVector
    get() {
        val current = _userEdit
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.UserEdit",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                fill = SolidColor(Color(0xFF292D32)),
            ) {
                moveTo(x = 12.0f, y = 2.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = true, isPositiveArc = false, dx1 = 0.0f, dy1 = 10.0f)
                arcToRelative(a = 5.0f, b = 5.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.0f, dy1 = -10.0f)
                moveToRelative(dx = 2.17f, dy = 4.51f)
                lineToRelative(dx = -2.7f, dy = 2.7f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = -0.45f, dy1 = 0.23f)
                lineTo(x = 9.99f, y = 9.58f)
                curveTo(x1 = 9.61f, y1 = 9.63f, x2 = 9.35f, y2 = 9.37f, x3 = 9.41f, y3 = 9.0f)
                lineToRelative(dx = 0.15f, dy = -1.03f)
                arcToRelative(a = 1.0f, b = 1.0f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = true, dx1 = 0.23f, dy1 = -0.45f)
                lineToRelative(dx = 2.7f, dy = -2.7f)
                curveToRelative(dx1 = 0.46f, dy1 = -0.46f, dx2 = 1.01f, dy2 = -0.68f, dx3 = 1.69f, dy3 = 0.0f)
                reflectiveCurveToRelative(dx1 = 0.45f, dy1 = 1.23f, dx2 = -0.01f, dy2 = 1.69f)
                moveTo(x = 12.0f, y = 14.0f)
                curveToRelative(dx1 = -5.01f, dy1 = 0.0f, dx2 = -9.09f, dy2 = 3.36f, dx3 = -9.09f, dy3 = 7.5f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.5f, dy1 = 0.5f)
                horizontalLineToRelative(dx = 17.18f)
                arcToRelative(a = 0.5f, b = 0.5f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 0.5f, dy1 = -0.5f)
                curveToRelative(dx1 = 0.0f, dy1 = -4.14f, dx2 = -4.08f, dy2 = -7.5f, dx3 = -9.09f, dy3 = -7.5f)
            }
        }.build().also { _userEdit = it }
    }

@Suppress("ObjectPropertyName")
private var _userEdit: ImageVector? = null
