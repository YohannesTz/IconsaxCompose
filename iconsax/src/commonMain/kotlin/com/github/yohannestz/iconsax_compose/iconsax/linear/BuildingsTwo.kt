package com.github.yohannestz.iconsax_compose.iconsax.linear

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BuildingsTwo: ImageVector
    get() {
        val current = _buildingsTwo
        if (current != null) return current

        return ImageVector.Builder(
            name = "com.github.yohannestz.iconsax_compose.iconsax.IconsaxTheme.BuildingsTwo",
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
                moveTo(x = 6.7f, y = 18.0f)
                horizontalLineTo(x = 4.15f)
                quadTo(x1 = 2.0f, y1 = 18.0f, x2 = 2.0f, y2 = 15.85f)
                verticalLineTo(y = 4.15f)
                quadTo(x1 = 2.0f, y1 = 2.0f, x2 = 4.15f, y2 = 2.0f)
                horizontalLineToRelative(dx = 4.3f)
                quadToRelative(dx1 = 2.15f, dy1 = 0.0f, dx2 = 2.15f, dy2 = 2.15f)
                verticalLineTo(y = 6.0f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 17.37f, y = 8.42f)
                verticalLineToRelative(dy = 11.16f)
                quadToRelative(dx1 = 0.0f, dy1 = 2.42f, dx2 = -2.41f, dy2 = 2.42f)
                horizontalLineTo(x = 9.12f)
                quadTo(x1 = 6.7f, y1 = 22.0f, x2 = 6.7f, y2 = 19.58f)
                verticalLineTo(y = 8.42f)
                quadTo(x1 = 6.7f, y1 = 6.0f, x2 = 9.12f, y2 = 6.0f)
                horizontalLineToRelative(dx = 5.84f)
                quadToRelative(dx1 = 2.41f, dy1 = 0.0f, dx2 = 2.41f, dy2 = 2.42f)
            }
            path(
                stroke = SolidColor(Color(0xFF292D32)),
                strokeLineCap = StrokeCap.Round,
                strokeLineJoin = StrokeJoin.Round,
                strokeLineMiter = 10.0f,
                strokeLineWidth = 1.5f,
            ) {
                moveTo(x = 13.4f, y = 6.0f)
                verticalLineTo(y = 4.15f)
                quadTo(x1 = 13.4f, y1 = 2.0f, x2 = 15.55f, y2 = 2.0f)
                horizontalLineToRelative(dx = 4.3f)
                quadTo(x1 = 22.0f, y1 = 2.0f, x2 = 22.0f, y2 = 4.15f)
                verticalLineToRelative(dy = 11.7f)
                quadTo(x1 = 22.0f, y1 = 18.0f, x2 = 19.85f, y2 = 18.0f)
                horizontalLineToRelative(dx = -2.48f)
                moveTo(x = 10.0f, y = 11.0f)
                horizontalLineToRelative(dx = 4.0f)
                moveToRelative(dx = -4.0f, dy = 3.0f)
                horizontalLineToRelative(dx = 4.0f)
                moveToRelative(dx = -2.0f, dy = 8.0f)
                verticalLineToRelative(dy = -3.0f)
            }
        }.build().also { _buildingsTwo = it }
    }

@Suppress("ObjectPropertyName")
private var _buildingsTwo: ImageVector? = null
