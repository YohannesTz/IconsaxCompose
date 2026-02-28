package com.github.yohannestz.iconsax_compose.iconsax.broken

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BuildingFour: ImageVector
    get() {
        val current = _buildingFour
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BuildingFour",
            defaultWidth = 24.0.dp,
            defaultHeight = 24.0.dp,
            viewportWidth = 24.0f,
            viewportHeight = 24.0f,
        ).apply {
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 1.0f, y = 22.0f)
                horizontalLineToRelative(dx = 22.0f)
                moveToRelative(dx = -3.22f, dy = 0.01f)
                verticalLineToRelative(dy = -4.46f)
                moveToRelative(dx = 0.02f, dy = -6.66f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.2f, dy1 = 2.2f)
                verticalLineToRelative(dy = 2.27f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.2f, dy1 = 2.2f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = 2.2f, dy1 = -2.2f)
                verticalLineToRelative(dy = -2.27f)
                arcToRelative(a = 2.2f, b = 2.2f, theta = 0.0f, isMoreThanHalf = false, isPositiveArc = false, dx1 = -2.2f, dy1 = -2.2f)
                moveTo(x = 2.1f, y = 6.02f)
                quadTo(x1 = 2.1f, y1 = 3.0f, x2 = 5.09f, y2 = 3.0f)
                horizontalLineToRelative(dx = 6.23f)
                quadToRelative(dx1 = 2.98f, dy1 = 0.0f, dx2 = 2.98f, dy2 = 3.02f)
                verticalLineTo(y = 22.0f)
                moveTo(x = 2.1f, y = 22.0f)
                verticalLineTo(y = 10.01f)
                moveToRelative(dx = 3.7f, dy = -1.76f)
                horizontalLineToRelative(dx = 4.95f)
                moveTo(x = 5.8f, y = 12.0f)
                horizontalLineToRelative(dx = 4.95f)
                moveToRelative(dx = -2.5f, dy = 10.0f)
                verticalLineToRelative(dy = -3.75f)
            }
        }.build().also { _buildingFour = it }
    }

@Suppress("ObjectPropertyName")
private var _buildingFour: ImageVector? = null
